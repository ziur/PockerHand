package com.jalasoft.jaggaer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by ale on 9/8/2018.
 */
class PokerGameTest {
    @Test
    void royalFlushWinner() {
		PokerGame pokerGame = new PokerGame();
		PokerHandBuilder builder = new StringInputBuilder();
		Player juan = Player.create("Juan", builder.getHand("AH KH QH JH 10H"));
		Player pedro = Player.create("Pedro", builder.getHand("4S 4C 4H 4D 2S"));
		Player pedro2 = Player.create("Pedro", builder.getHand("8S 8C 2H 6D 6S"));
		pokerGame.addHand(pedro2);
		pokerGame.addHand(juan);
		pokerGame.addHand(pedro);

		PokerResult result = pokerGame.getResults();
		System.out.println(result);
    }

	@Test
	void royalFlushDraw() {
		PokerGame pokerGame = new PokerGame();
		PokerHandBuilder builder = new StringInputBuilder();
		Player juan = Player.create("Juan", builder.getHand("AH KH QH JH 10H"));
		Player pedro = Player.create("Pedro", builder.getHand("4S 4C 4H 4D 2S"));
		Player pedro2 = Player.create("Pedro", builder.getHand("AS KS QS JS 10S"));
		pokerGame.addHand(pedro2);
		pokerGame.addHand(juan);
		pokerGame.addHand(pedro);

		PokerResult result = pokerGame.getResults();
		System.out.println(result);
	}

}