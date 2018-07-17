package blackjack;

import javax.swing.ImageIcon;

public class Card {
	public enum Suit {
		HEARTS, DIAMONDS, SPADES, CLUBS;
	}

	public enum Face {
		Ace(11), Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10), Jack(10), Queen(
				10), King(10);

		private int value;

		private Face(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
	}

	private Suit suit;
	private Face face;
	private ImageIcon image;

	public Card(Suit suit, Face face) {
		this.face = face;
		this.suit = suit;
		this.image = new ImageIcon(getClass().getResource("newImages/" + this.toString() + ".png"));
	}

	public Face getFace() {
		return face;
	}

	public Suit getSuit() {
		return suit;
	}

	public ImageIcon image() {
		return image;
	}

	@Override
	public String toString() {
		return "" + suit + face;
	}
}