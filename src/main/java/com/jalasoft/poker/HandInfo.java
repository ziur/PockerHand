package com.jalasoft.poker;

import java.util.List;
import java.util.Map;

/**
 * Created by ale on 9/9/2018.
 */
public class HandInfo {
    private List<Card> cards;
    private final boolean isStraight;
    private final Map<Suit, List<Card>> cardsBySuit;
    private final Map<Rank, List<Card>> cardsByRank;
    private final Card lastCard;

    public HandInfo(List<Card> cards, boolean isStraight, Map<Suit, List<Card>> cardsBySuit, Map<Rank, List<Card>> cardsByRank) {
        this.cards = cards;
        this.isStraight = isStraight;
        this.cardsBySuit = cardsBySuit;
        this.cardsByRank = cardsByRank;
        this.lastCard = cards.get(cards.size() - 1);
    }

    public boolean isStraight() {
        return isStraight;
    }

    public Map<Suit, List<Card>> getCardsBySuit() {
        return cardsBySuit;
    }

    public Map<Rank, List<Card>> getCardsByRank() {
        return cardsByRank;
    }

    public List<Card> getCards() {
        return cards;
    }

    public Card getLastCard() {
        return lastCard;
    }
}
