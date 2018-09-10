package com.jalasoft.jaggaer.matcher;

import com.jalasoft.jaggaer.*;

import java.util.Iterator;
import java.util.List;

public class PokerMatcher implements PokerHandMatcher {
    @Override
    public HandGame matchHand(HandInfo handInfo) {
        if (handInfo.getCardsBySuit().size() != 2) {
            return HandGame.NO_MATCH;
        }

        Iterator<List<Card>> values = handInfo.getCardsBySuit().values().iterator();
        List<Card> cards1 = values.next();
        List<Card> cards2 = values.next();
        Card maxCard = cards1.size() > cards2.size() ? cards1.get(0) : cards2.get(0);

        return new HandGame(PokerHands.ROYAL_FLUSH, maxCard.getRank());

    }
}
