package com.jalasoft.poker;

public class Card implements Comparable<Card> {
	Rank rank;
	Suit suit;

	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
	}

    public Rank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

	@Override
	public int compareTo(Card c) {
		return Rank.compare(this.rank, c.rank);
	}
}
