package com.jalasoft.jaggaer;

import java.util.Comparator;

public enum Rank {

    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11, "J"),
    QUEEN(12, "Q"),
    KING(13, "K"),
    ACE(14, "A");

    public static final Comparator COMPARATOR = new Comparator<Rank>() {
        @Override
        public int compare(Rank o1, Rank o2) {
            return Integer.compare(o1.value, o2.value);
        }
    };
    private final int value;
    private final String symbol;

    Rank(int value) {

        this(value, String.valueOf(value));
    }


    Rank(int value, String symbol) {

        this.value = value;
        this.symbol = symbol;
    }

    public static int compare(Rank o1, Rank o2) {
        return Integer.compare(o1.value, o2.value);
    }

    public int getValue() {
        return value;
    }

    public static Rank getByValue(String value) {
        for (Rank rank : values()) {
            if (rank.symbol.equals(value)) {
                return rank;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Rank{" +
                "value=" + value +
                '}';
    }
}
