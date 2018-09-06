package com.jalasoft.jaggaer;

import java.io.StringReader;

public class PokerHandTest {

	public static void royalFlushIsWinner() {
		PokerGame pokerGame = new PokerGame();
		PokerHandBuilder builder = new StringInputBuilder();
		Player juan = Player.create("Juan", builder.getHand(new StringReader("AH KH QH JH 10H")));
		Player pedro = Player.create("Pedro", builder.getHand(new StringReader("KS QS JS 10S 9S")));
		pokerGame.addHand(juan);
		pokerGame.addHand(pedro);
		PokerResult result = pokerGame.getResults();
		assertTrue("royalFlushIsWinner", juan.equals(result.getWinner()));
	}

	private static void assertTrue(String test, boolean equals) {
		System.out.println(test + (equals ? "[Pass]" : "[Fail]"));
	}
}
