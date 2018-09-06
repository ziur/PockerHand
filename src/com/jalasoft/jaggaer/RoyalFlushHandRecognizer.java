package com.jalasoft.jaggaer;

public class RoyalFlushHandRecognizer implements PokerHandRecognizer {

	@Override
	public boolean matchHand(Hand hand) {
		int rank = hand.getLowestCard().getRank().getValue() - 1;
		for (Card card : hand.getCards()) {
			if (rank + 1 != card.getRank().getValue()) {
				return false;
			}

			rank = card.getRank().getValue();
		}

		return true;
	}
}
