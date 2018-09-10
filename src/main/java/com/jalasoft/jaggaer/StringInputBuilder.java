package com.jalasoft.jaggaer;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class StringInputBuilder implements PokerHandBuilder<String> {
	@Override
	public List<Card> getHand(String input) {
		List<Card> cards = new ArrayList<>();
		for (String rawCard : input.split(" ")) {
			String suit = rawCard.substring(rawCard.length() - 1);
			String rank = rawCard.substring(0, rawCard.length() - 1);
			cards.add(new Card(Suit.getByValue(suit), Rank.getByValue(rank)));

		}

		return cards;
	}
}
