package com.jalasoft.jaggaer;

public enum PokerHands {
	ROYAL_FLUSH( new RoyalFlushHandRecognizer());

	private final PokerHandRecognizer recognizer;

	PokerHands(PokerHandRecognizer recognizer) {
		this.recognizer = recognizer;
	}

	public boolean matchHand(Hand hand) {
		return recognizer.matchHand(hand);
	}


}
