package com.jalasoft.jaggaer.matcher;

import com.jalasoft.jaggaer.Card;
import com.jalasoft.jaggaer.HandGame;
import com.jalasoft.jaggaer.HandInfo;
import com.jalasoft.jaggaer.PokerHandMatcher;
import com.jalasoft.jaggaer.PokerHands;
import com.jalasoft.jaggaer.Rank;

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
