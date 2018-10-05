package com.jalasoft.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum ShuffleCard implements ShuffleAlgorithm {

	BASIC(new ShuffleAlgorithm() {
		@Override
		public void doShuffle(List<Card> cards) {
			List<Card> shuffled = new ArrayList<>(cards);
			Collections.shuffle(shuffled, new Random(System.nanoTime()));
		}
	});

	private final ShuffleAlgorithm shuffleAlgorithm;

	ShuffleCard(ShuffleAlgorithm shuffleAlgorithm) {

		this.shuffleAlgorithm = shuffleAlgorithm;
	}

	@Override
	public void doShuffle(List<Card> cards) {
		shuffleAlgorithm.doShuffle(cards);
	}
}
