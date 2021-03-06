package com.jalasoft.poker.matcher;

import com.jalasoft.poker.*;

import java.util.List;
import java.util.Map;

/**
 * Created by ale on 9/9/2018.
 */
public class TwoPairsMatcher implements PokerHandMatcher {
    @Override
    public HandGame matchHand(HandInfo handInfo) {
        if (handInfo.getCardsBySuit().size() != 3 && handInfo.getCardsByRank().size() != 3) {
            return HandGame.NO_MATCH;
        }

        Rank rank = Rank.TWO;

        int pairs = 0;
        for (Map.Entry<Rank, List<Card>> entry : handInfo.getCardsByRank().entrySet()) {
            if (entry.getValue().size() == 2) {
                pairs++;
                if (Rank.compare(rank, entry.getKey()) == 1) {
                    rank = entry.getKey();
                }
            }
        }

        if (pairs != 2) {
            return HandGame.NO_MATCH;
        }


        return new HandGame(PokerHands.TWO_PAIR, rank);
    }
}
