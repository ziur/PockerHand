package com.jalasoft.poker;

public enum Suit {

    SPADE("S"),
    DIAMOND("D"),
    CLUB("C"),
    HEARTH("H");


    private String symbol;

    Suit(String symbol) {

        this.symbol = symbol;
    }

    public static Suit getByValue(String value) {

        for (Suit suit : values()) {
            if (suit.getSymbol().equals(value)) {
                return suit;
            }
        }
        return null;
    }

    public String getSymbol() {
        return symbol;
    }
}
