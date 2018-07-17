package labitinerary;

import java.util.ArrayList;
import java.util.Scanner;

public class labitinerary {

	private static Scanner userInput;

	public static void main(String[] args) {
		
		ArrayList<String> itinerary = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		userInput = new Scanner(System.in);
		String done;
		String travelRoute = "\ntravel route:";
		int count = 0;
		
		System.out.println("Enter a Destination, when finished type \"done\"\n");
		System.out.print("Destination: ");
		done = userInput.nextLine();
		
		while(!(done.equalsIgnoreCase("done"))) {
			itinerary.add(done);
			System.out.print("Destination: ");
			done = userInput.nextLine();
		}
		
		for (String t: itinerary) {
			count++;
			if(count == 1) {
				sb.append(t.toUpperCase());
			} else {
				sb.append(" to " + t.toUpperCase());
			}
		}
		
		System.out.println(travelRoute);
		System.out.print(sb);
		
	}

}
