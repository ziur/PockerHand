package com.jalasoft.poker;

import java.util.Collection;

public class Deck {
	private final Collection<Card> cards;

	public Deck(Collection<Card> cards) {
		this.cards = cards;
	}

	public Card deal() {
		return cards.pop;
	}
}
