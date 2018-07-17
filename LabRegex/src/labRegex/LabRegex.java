package labRegex;

import java.util.Scanner;

public class LabRegex {
	
	public static void main(String[] args) {
		String myRegex1 = "CS\\d{4}";
		
		String capA = "^[A]\\w+";
		
		String upcaseVowel = "^[AEIOU]\\w+";
		
		String upcaseVowel_2 = "^[AEIOU]+{2}\\w+";
		
		String number = "^\\(\\d{3}\\) ?\\d{3}( |-)?\\d{4}|^\\d{3}( |-)?\\d{3}( |-)?\\d{4}";
		
		String email = "^[A-Za-z0-9](([_\\.\\-]?[a-zA-Z0-9]+)*)@([A-Za-z0-9]+)(([\\.\\-]?[a-zA-Z0-9]+)*)\\.([A-Za-z]{2,})$";
		
		test(email);
	}
	
	private static void test(String regex) {
		String word;
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter words to match the expression %s%n", regex);
		System.out.println("Enter DONE when you are finished");
		System.out.print("Word: ");
		word = input.nextLine();
		
		while (!word.equalsIgnoreCase("done")) {
			System.out.printf("%s %s%n", word, word.matches(regex) ? "matches"
			: "does not match");
			System.out.print("Word: ");
			word = input.nextLine();
		}
	}
}
