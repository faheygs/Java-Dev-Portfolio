package labexceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LabExceptionHandilng {
	
	public static void main(String[] args) { 
		
		try {
			int digit = numberFromUser();
			int result = sevenModulusN(digit);
			System.out.printf("7 %% %d = %d", digit, result);
		} catch (Exception e) {
			System.out.print("A problem occured: ");
			System.out.println(e.getMessage());
		}
	}
	
	private static int numberFromUser() {
		Scanner input = new Scanner(System.in);
		boolean finished = false;
		int userInput = 0;
		
		do {
			try {
				System.out.print("number: ");
				userInput = input.nextInt();
				finished = true;
			} catch (InputMismatchException e) {
				System.out.println("Please enter a whole number.");
				input.nextLine();
			}
		} while(!finished);

		return userInput;
	}

	private static int sevenModulusN(int number) {
		if(number == 0) {
			throw new IllegalArgumentException("Unable to calculate 7 % 0");
		}
		return 7 % number;
	}
}