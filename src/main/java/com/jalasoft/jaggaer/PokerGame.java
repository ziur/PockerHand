package com.jalasoft.jaggaer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PokerGame {

	private List<Player> players;

	public PokerGame() {
		players = new ArrayList<>();
	}

	public void addHand(Player player) {
		players.add(player);
	}

	public PokerResult getResults() {

		Iterator<Player> iterator = players.iterator();
		Player winner = iterator.next();

		PokerResult result = new PokerResult();
		while(iterator.hasNext()) {
			Player player = iterator.next();
			int comparision = winner.getHand().compareTo(player.getHand());
			if (comparision == 0) {
				result.addTiePlayer(winner);
				result.addTiePlayer(player);
				result.markAsDraw();
			} else if (comparision == 1) {
				winner = player;
			}
		}

		if (result.getGameResult() != PokerResult.GameResult.DRAW) {
			result.setWinner(winner);
			result.markAsWinner();
		}

		return result;
	}
}
