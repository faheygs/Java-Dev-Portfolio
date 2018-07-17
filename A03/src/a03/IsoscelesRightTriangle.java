package a03;

/**
 * 
 * @author Gavin Fahey
 * @date Feb 8, 2017
 * Class CSIS 1410-003-Sp17
 */
public class IsoscelesRightTriangle {
	//private final int named leg
	private final int leg;
	
	//IsoscelesRightTriangle constructor taking in an int and assigning it to the leg variable
	public IsoscelesRightTriangle(int l) {
		this.leg = l;
	}
	
	//hypotenuse method that returns Math.hypot(getLeg(), getLeg()) as a double
	public double hypotenuse() {
		return Math.hypot(getLeg(), getLeg());
	}

	//getLeg method that returns the leg variable
	public int getLeg() {
		return leg;
	}
	
	//Overridden toString method that returns a string with the leg variable
	@Override
	public String toString() {
		return "IsoscelesRightTriangle(" + getLeg() + ")";
	}
}
