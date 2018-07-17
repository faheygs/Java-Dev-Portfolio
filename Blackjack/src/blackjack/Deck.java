package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import blackjack.Card.Face;
import blackjack.Card.Suit;

public class Deck {
	public List<Card> deckOfCards = new ArrayList<Card>();

	public Deck() {

		for (Suit s : Suit.values()) {
			for (Face f : Face.values()) {
				deckOfCards.add(new Card(s, f));
			}
		}
		shuffleDeck();
	}

	public void shuffleDeck() {
		Collections.shuffle(deckOfCards);
	}

	public Card removeCard(int i) {
		Card remove = deckOfCards.get(i);
		deckOfCards.remove(i);
		return remove;
	}

	@Override
	public String toString() {
		return deckOfCards.toString();
	}

	// public static void main(String[] args) {
	// Deck d = new Deck();
	// System.out.println(d);
	// }

}