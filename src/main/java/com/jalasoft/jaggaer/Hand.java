package com.jalasoft.jaggaer;

import java.util.LinkedList;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private final LinkedList<Card> cards;
    private HandGame handGame;

    public Hand(List<Card> cards) {
        this.cards = new LinkedList<>(cards);
        identifyHand();
    }

    private void identifyHand() {
        HandGameRecognizer recognizer = new HandGameRecognizer();
        handGame = recognizer.matchHand(cards);

    }

    public LinkedList<Card> getCards() {
        return cards;
    }

    public HandGame getHandGame() {
        return handGame;
    }


	@Override
	public int compareTo(Hand o) {
    	int compareGame = Integer.compare(handGame.getPokerHand().ordinal(), o.handGame.getPokerHand().ordinal());

		if (compareGame == 0) {
			return Rank.compare(handGame.getRank(), o.handGame.getRank());
		}
		return compareGame;
	}

	@Override
	public String toString() {
		return "Hand{" +
				"handGame=" + handGame +
				'}';
	}
}
