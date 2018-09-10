package com.jalasoft.jaggaer;

import java.util.List;

public class Player {


	private final String name;
	private final Hand hand;

	public Player(String name, Hand hand) {

		this.name = name;
		this.hand = hand;
	}

	public static Player create(String name, List<Card> cards) {
		return new Player(name, new Hand(cards));
	}

	public String getName() {
		return name;
	}

	public Hand getHand() {
		return hand;
	}
}
