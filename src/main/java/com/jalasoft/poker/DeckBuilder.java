package com.jalasoft.poker;

import java.util.Collections;
import java.util.List;

public class DeckBuilder {

	private final List<Card> cards;

	private DeckBuilder(List<Card> cards) {

		this.cards = cards;
	}

	public Deck build() {
		return new Deck(Collections.unmodifiableList()leCollection(cards));
	}

	public static DeckBuilder type(DeckTypeGenerator generator) {
		List<Card> cards = generator.generate();
		return new DeckBuilder(cards);
	}

	public DeckBuilder shuffle(ShuffleCard shuffleCard) {
		shuffleCard.doShuffle(cards);
		return this;
	}
}
