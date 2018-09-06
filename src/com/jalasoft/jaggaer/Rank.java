package com.jalasoft.jaggaer;

import java.util.Comparator;

public enum Rank  {

	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGTH(8),
	NINE(9),
	TEN(10),
	JACK(11),
	QUEEN(12),
	KING(13),
	ACE(14);

	public static final Comparator COMPARATOR = new Comparator<Rank>() {
		@Override
		public int compare(Rank o1, Rank o2) {
			return Integer.compare(o1.value, o2.value);
		}
	};
	private final int value;

	Rank(int value) {

		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static int compare(Rank o1, Rank o2) {
		return Integer.compare(o1.value, o2.value);
	}
}
