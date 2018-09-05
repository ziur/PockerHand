package com.jalasoft.jaggaer;

import javax.smartcardio.Card;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

public interface PokerHandBuilder {
	List<Card> getHand(Reader stringReader);
}
