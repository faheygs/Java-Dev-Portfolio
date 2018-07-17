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
import java.util.List;
import java.util.Scanner;

public class Exercise2 {

	public static <T> void main(String[] args) {
		ArrayList<Double> writeto = new ArrayList<>();
		writeto.add(2.345);
		writeto.add(6.4);
		writeto.add(8.7654321);
		
		List<T> numbers = new ArrayList<T>();

		try {
			PrintWriter pw = new PrintWriter("src/final1410/MyFile.txt");
			
			for(Double d: writeto) {
				pw.println(d);
			}
			
			pw.close();
			
			Scanner input = new Scanner(new File("src/final1410/MyFile.txt"));
			while(input.hasNextLine()) {
				numbers.add((T) input.nextLine());
			}
			
			input.close();
			
			System.out.print("List       : ");
			for(T t: numbers) {
				Double x = Double.parseDouble((String) t);
				System.out.printf("%.2f  ", x);
			}
			
			System.out.println();
			
			System.out.print("Double List: ");
			for(T t: duplicateElements(numbers)) {
				Double x = Double.parseDouble((String) t);
				System.out.printf("%.2f  ", x);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static <T> List<T> duplicateElements(List<T> list) {
		List<T> duplicate = new ArrayList<T>();
		for(T t: list) {
			duplicate.add(t);
			duplicate.add(t);
		}
		
		return duplicate;
	}

}
