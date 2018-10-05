package com.jalasoft.poker;

import org.junit.jupiter.api.Test;

class DeckBuilderTest {
	@Test
	void deckBuilder() {
		Deck deck = DeckBuilder.type(DeckType.STANDART_52).shuffle(ShuffleCard.BASIC).build();
		Card card = deck.deal();
	}
}