package LabConcert;

public class ConcertApp {

	public static void main(String[] args) {
		Time start = new Time(16,30,00);
		Time end = new Time(20,00,00);
		
		Concert  c = new Concert("Our Last Night", start, end);
		
		System.out.print(c.toString());
	}
}