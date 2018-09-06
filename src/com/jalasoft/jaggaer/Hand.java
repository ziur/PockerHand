package com.jalasoft.jaggaer;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Hand {
	private final LinkedList<Card> cards;

	public Hand(List<Card> cards) {
		this.cards = new LinkedList<>(cards);
		Collections.sort(cards);

		identifyHand();
	}

	private void identifyHand() {
		for (PokerHands pokerHands : PokerHands.values()) {

		}

	}

	public Collection<Card> getCards() {
		return null;
	}

	public Card getLowestCard() {
		return cards.getFirst();
	}
}
