package com.jalasoft.jaggaer;

import com.jalasoft.jaggaer.matcher.PokerMatcher;
import com.jalasoft.jaggaer.matcher.RoyalFlushMatcher;
import com.jalasoft.jaggaer.matcher.TwoPairsMatcher;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public enum PokerHands {
    ROYAL_FLUSH(new RoyalFlushMatcher()),
    POKER(new PokerMatcher()),
    TWO_PAIR(new TwoPairsMatcher())
    ;

    private static List<PokerHands> CHAIN = Arrays.asList(values());
    private final com.jalasoft.jaggaer.PokerHandMatcher handMatcher;

    PokerHands(com.jalasoft.jaggaer.PokerHandMatcher handMatcher) {
        this.handMatcher = handMatcher;
    }

    public static ListIterator<PokerHands> getChain() {
        return CHAIN.listIterator();
    }

    public com.jalasoft.jaggaer.PokerHandMatcher getHandMatcher() {
        return handMatcher;
    }


}
