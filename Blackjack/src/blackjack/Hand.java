package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {
	public List<Card> hand = new ArrayList<Card>();
	
	public void addCard(Card c) {
		hand.add(c);
	}
	
	public int value() {
		int value = 0;
		boolean ace = false;
		
		for (Card c: hand) {
			value += c.getFace().getValue();
			if (c.getFace().getValue() == 11){
				ace = true;
			}
		}
		
		if (value > 21 && ace == true) {
			value -= 10;
		}
		
		return value;
	}
}