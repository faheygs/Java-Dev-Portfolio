package blackjack;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Game {

	Deck deck = new Deck();
	Hand playerHand = new Hand();
	Hand dealerHand = new Hand();
	boolean playerBusts = false;
	boolean playerWins = false;
	boolean dealerBusts = false;
	boolean dealerWins = false;
	boolean tieGame = false;

	int card;

	public void newGame() {

		playerBusts = false;
		playerWins = false;
		dealerBusts = false;
		dealerWins = false;
		tieGame = false;
		playerHand.hand.clear();
		dealerHand.hand.clear();

		int card = 0;

		// deal first 4 cards
		playerHand.addCard(deck.removeCard(card));
		dealerHand.addCard(deck.removeCard(card + 1));
		playerHand.addCard(deck.removeCard(card + 2));
		dealerHand.addCard(deck.removeCard(card + 3));

		if (deck.deckOfCards.size() < 40) {
			Deck newDeck = new Deck();
			ArrayList moreCards = new ArrayList();
			moreCards.addAll(newDeck.deckOfCards);
			deck.deckOfCards.addAll(moreCards);

		}

		if (dealerHand.value() == 21) {
			if (playerHand.value() == 21) {
				tieGame = true;
			} else {
				dealerWins = true;
			}
		}

		if (playerHand.value() == 21 && dealerHand.value() != 21) {
			playerWins = true;
		}
	}

	public void hit() {
		Card newCard = deck.removeCard(card);
		playerHand.addCard(newCard);
		card++;

		if (playerHand.value() > 21) {
			playerBusts = true;
		}
	}

	public void checkWinner() {
		if (playerHand.value() > dealerHand.value()) {
			playerWins = true;
		}
		if (dealerHand.value() > playerHand.value()) {
			dealerWins = true;
		}
		if (dealerHand.value() == playerHand.value()) {
			tieGame = true;
		}
	}

	public void stay() {
		while (dealerHand.value() <= 16) {
			dealerDrawCard();
		}
		this.checkWinner();
	}

	public void dealerDrawCard() {
		if (dealerHand.value() >= 17) {
			return;
		} else {
			dealerHand.addCard(deck.removeCard(card));
			card++;
		}

		if (dealerHand.value() > 21) {
			dealerBusts = true;
		}

	}

	public ImageIcon image() {
		for (Card c : playerHand.hand) {
			return c.image();
		}
		return null;
	}

}