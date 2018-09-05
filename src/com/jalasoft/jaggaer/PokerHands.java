package com.jalasoft.jaggaer;

public enum PokerHands {
	ROYAL_FLUSH( new RoyalFlushHand());

	private final PokerHand pokerHand;

	PokerHands(PokerHand pokerHand) {
		this.pokerHand = pokerHand;
	}
}
