package com.jalasoft.poker.matcher;

import com.jalasoft.poker.*;

public class RoyalFlushMatcher implements PokerHandMatcher {
    @Override
    public HandGame matchHand(HandInfo handInfo) {
        if (handInfo.getCardsBySuit().size() > 1 || !handInfo.isStraight() || handInfo.getLastCard().getRank() != Rank.ACE ) {
            return HandGame.NO_MATCH;
        }

        return new HandGame(PokerHands.ROYAL_FLUSH, Rank.ACE);

    }
}
