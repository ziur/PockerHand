package com.jalasoft.jaggaer;

/**
 * Created by ale on 9/8/2018.
 */
public class HandGame {
    public static final HandGame NO_MATCH = new HandGame(null, 0);
    private final PokerHands pokerHand;
    private final int weight;

    public HandGame(PokerHands pokerHand, Rank rank) {

        this.pokerHand = pokerHand;
        this.weight = rank;
    }

    public PokerHands getPokerHand() {
        return pokerHand;
    }

    public int getWeight() {
        return weight;
    }
}
