package com.jalasoft.jaggaer;

import com.jalasoft.jaggaer.matcher.PokerMatcher;
import com.jalasoft.jaggaer.matcher.RoyalFlushHandMatcher;
import com.jalasoft.jaggaer.matcher.TwoPairs;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public enum PokerHands {
    ROYAL_FLUSH(new RoyalFlushHandMatcher()),
    POKER(new PokerMatcher()),
    TWO_PAIR(new TwoPairs())
    ;

    private static List<PokerHands> CHAIN = Arrays.asList(values());
    private final PokerHandMatcher handMatcher;

    PokerHands(PokerHandMatcher handMatcher) {
        this.handMatcher = handMatcher;
    }

    public static ListIterator<PokerHands> getChain() {
        return CHAIN.listIterator();
    }

    public PokerHandMatcher getHandMatcher() {
        return handMatcher;
    }


}
