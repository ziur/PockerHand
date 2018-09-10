package com.jalasoft.jaggaer;

import java.util.ArrayList;
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



		for (Player player : players) {
			System.out.println(player.getHand().getHandGame());

		}

		return null;
	}
}
