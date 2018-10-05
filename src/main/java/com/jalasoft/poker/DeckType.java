package com.jalasoft.poker;

import java.util.ArrayList;
import java.util.List;

public enum DeckType implements DeckTypeGenerator {
	STANDART_52(() -> {
		List<Card> cards = new ArrayList<>(52);
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				cards.add(new Card(suit, rank));
			}
		}
		return cards;
	});

	private final DeckTypeGenerator generator;

	DeckType(DeckTypeGenerator generator) {

		this.generator = generator;
	}

	@Override
	public List<Card> generate() {
		return generator.generate();
	}
}
