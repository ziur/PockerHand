package com.jalasoft.poker;

import java.util.HashSet;
import java.util.Set;

public class PokerResult {
	private Set<Player> tiedPlayers;
	private GameResult gameResult;
	private Player winner;

	public PokerResult() {
		tiedPlayers = new HashSet<>();
	}

	public void markAsDraw() {
		gameResult = GameResult.DRAW;
	}

	public void addTiePlayer(Player player) {
		tiedPlayers.add(player);
	}

	public Player getWinner() {
		return winner;
	}

	public void setWinner(Player winner) {
		this.winner = winner;
	}

	public GameResult getGameResult() {
		return gameResult;
	}

	public void setGameResult(GameResult gameResult) {
		this.gameResult = gameResult;
	}

	public void markAsWinner() {
		gameResult = GameResult.WIN;
	}

	public enum GameResult {
		WIN,
		DRAW
	}

	@Override
	public String toString() {
		return "GameResult => " + gameResult + " - " +
				(gameResult == GameResult.DRAW ? tiedPlayers : winner) ;
	}
}
