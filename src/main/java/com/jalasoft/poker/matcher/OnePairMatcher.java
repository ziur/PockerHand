package com.jalasoft.poker.matcher;

import com.jalasoft.poker.Card;
import com.jalasoft.poker.HandGame;
import com.jalasoft.poker.HandInfo;
import com.jalasoft.poker.PokerHandMatcher;
import com.jalasoft.poker.PokerHands;
import com.jalasoft.poker.Rank;

import java.util.List;
import java.util.Map;

/**
 * Created by ale on 9/9/2018.
 */
public class OnePairMatcher implements PokerHandMatcher {
    @Override
    public HandGame matchHand(HandInfo handInfo) {
        if (handInfo.getCardsByRank().size() != 4) {
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
