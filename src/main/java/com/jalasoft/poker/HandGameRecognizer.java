package com.jalasoft.poker;

import java.util.*;

/**
 * Created by ale on 9/9/2018.
 */
public class HandGameRecognizer {

    public HandGame matchHand(List<Card> cards) {
        Map<Suit, List<Card>> cardsBySuit = new HashMap<>(4);
        Map<Rank, List<Card>> cardsByRank = new HashMap<>(4);
        Collections.sort(cards);
        boolean isStraigth = true;
        int index = 0;
        for (Card card : cards) {
            List<Card> bySuits = cardsBySuit.computeIfAbsent(card.getSuit(), x -> new ArrayList<>());
            List<Card> byRank = cardsByRank.computeIfAbsent(card.getRank(), x -> new ArrayList<>());
            bySuits.add(card);
            byRank.add(card);
            if (isStraigth && index + 1 < cards.size() && card.getRank().getValue() + 1 != cards.get(index+1).getRank().getValue()) {
                isStraigth = card.getRank() == Rank.FOUR && cards.get(index+1).getRank() == Rank.ACE;
            }
            index++;
        }



        return evaluateHand(new HandInfo(cards, isStraigth, cardsBySuit, cardsByRank));
    }

    private HandGame evaluateHand(HandInfo handInfo) {
        ListIterator<PokerHands> chain = PokerHands.getChain();
        HandGame handGame = null;
        while (chain.hasNext()) {
            PokerHands next = chain.next();
            handGame = next.getHandMatcher().matchHand(handInfo);
            if (handGame != HandGame.NO_MATCH) {
                break;
            }
        }
        return handGame;
    }

}
