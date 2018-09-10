package com.jalasoft.jaggaer;

import java.util.LinkedList;
import java.util.List;

public class Hand {
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
}
