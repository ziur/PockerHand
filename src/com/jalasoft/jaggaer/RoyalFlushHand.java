package com.jalasoft.jaggaer;

public class RoyalFlushHand implements PokerHand {

	@Override
	public boolean matchHand(Hand hand) {
		int rank = hand.getLowestCard().getRank().value() - 1;
		for (Card card : hand.getCards()) {
			if (rank + 1 != card.getRank().value()) {
				return false;
			}
			rank = card.getRank().value();
		}

		return true;
	}
}
