package com.jalasoft.jaggaer;

import java.io.Reader;
import java.util.List;

public interface PokerHandBuilder {
	List<Card> getHand(Reader stringReader);
}
