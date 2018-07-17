package blackjack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PlayerScoreRecord

{

	private static int winnings;

	public static int getWinnings() {
		try (Scanner input = new Scanner(new File("src/blackjack/playerBank.txt"))) {
			if (input.hasNextInt()) {
				winnings = input.nextInt();
				if (winnings <= 0) {
					winnings = 250;
				}
			} else if (input.next() == null) {
				winnings = 250;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return winnings;

	}

	public static void setWinnings(int winnings) {

		File file = new File("src/playerBank.txt");
		PrintWriter pw;
		try {
			pw = new PrintWriter(file);
			pw.print(winnings);
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		PlayerScoreRecord.winnings = winnings;

	}

	public static void main(String[] args) {
		PlayerScoreRecord.getWinnings();
		PlayerScoreRecord.setWinnings(winnings);
	}

}