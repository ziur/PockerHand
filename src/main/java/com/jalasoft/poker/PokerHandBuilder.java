package com.jalasoft.poker;

import java.util.List;

public interface PokerHandBuilder<T> {
    List<Card> getHand(T input);
}
