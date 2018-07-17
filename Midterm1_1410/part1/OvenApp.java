package part1;

import java.util.ArrayList;

public class OvenApp {

	public static void main(String[] args) {
		
		ArrayList<Oven> ov = new ArrayList<>();
		
		ov.add(new MicrowaveOven(2, 1000));
		ov.add(new ConvectionOven(3));
		ov.add(new MicrowaveOven(1.5, 750));
		
		for(Oven o: ov) {
			System.out.println(o.toString()); 
			 
			if(o instanceof MicrowaveOven) {
				((MicrowaveOven) o).autoDefrost();
			}
		}
	}
}
