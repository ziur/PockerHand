package com.jalasoft.jaggaer;

public class Card implements Comparable<Card> {
	Rank rank;
	Suit suit;

	public Rank getRank() {
		return rank;
	}



	@Override
	public int compareTo(Card c) {
		return Rank.compare(this.rank, c.rank);
	}
}
