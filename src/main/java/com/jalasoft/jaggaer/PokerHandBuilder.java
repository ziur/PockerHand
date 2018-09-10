package com.jalasoft.jaggaer;

import java.util.List;

public interface PokerHandBuilder<T> {
    List<Card> getHand(T input);
}
