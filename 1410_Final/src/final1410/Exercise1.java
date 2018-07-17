package final1410;
/*
 * Gavin Fahey
 * CSIS 1410
 * FINAL CODE
 * April 25th, 2017
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		ArrayList<String> text = new ArrayList<>();
		text.add("Tom is born on Feb 2nd 1999.");
		text.add("He is 17 years old.");
		
		for(String t: text) {
			System.out.println(t);
		}
		
		System.out.println("\n...Creating file 'Modified.txt'...\n");
		
		try {
			PrintWriter pw = new PrintWriter("src/final1410/Modified.txt");
			
			for(String el: text) {
				String x = el;
				x = x.replaceAll("\\d", "#");
				pw.println(x);
			}
			
			pw.close();
			
			for(String t: text) {
				System.out.println(t);
			}
			
			System.out.println();
			System.out.println("Content of Modified.txt");
			System.out.println("-----------------------");
			Scanner input = new Scanner(new File("src/final1410/Modified.txt"));
			while(input.hasNextLine()) {
				String temp = input.nextLine();
				System.out.println(temp);
			}
			input.close();
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
