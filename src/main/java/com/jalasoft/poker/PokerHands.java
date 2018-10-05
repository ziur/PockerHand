package com.jalasoft.poker;

import com.jalasoft.poker.matcher.PokerMatcher;
import com.jalasoft.poker.matcher.RoyalFlushMatcher;
import com.jalasoft.poker.matcher.TwoPairsMatcher;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public enum PokerHands {
    ROYAL_FLUSH(new RoyalFlushMatcher()),
    POKER(new PokerMatcher()),
    TWO_PAIR(new TwoPairsMatcher())
    ;

    private static List<PokerHands> CHAIN = Arrays.asList(values());
    private final com.jalasoft.poker.PokerHandMatcher handMatcher;

    PokerHands(com.jalasoft.poker.PokerHandMatcher handMatcher) {
        this.handMatcher = handMatcher;
    }

    public static ListIterator<PokerHands> getChain() {
        return CHAIN.listIterator();
    }

    public com.jalasoft.poker.PokerHandMatcher getHandMatcher() {
        return handMatcher;
    }


}
