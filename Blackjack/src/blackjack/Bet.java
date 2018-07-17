package blackjack;

public class Bet {

	private int amount = 1000;

	// public bet()
	// {
	//
	// }

	public void lose(int number) {
		amount = amount - number;
	}

	public void win(int number) {
		amount = amount - number;
	}

	public int getAmount() {
		return amount;
	}
}