package com.jalasoft.jaggaer;

/**
 * Created by ale on 9/8/2018.
 */
public class HandGame {
    public static final HandGame NO_MATCH = new HandGame(null, null);
    private final PokerHands pokerHand;
    private Rank rank;


    public HandGame(PokerHands pokerHand, Rank rank) {

        this.pokerHand = pokerHand;

        this.rank = rank;
    }

    public PokerHands getPokerHand() {
        return pokerHand;
    }

    @Override
    public String toString() {
        return "HandGame{" +
                "pokerHand=" + pokerHand +
                ", rank=" + rank +
                '}';
    }
}
