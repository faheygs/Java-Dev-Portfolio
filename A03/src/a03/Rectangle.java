package a03;

/**
 * 
 * @author Gavin Fahey
 * @date Feb 8, 2017
 * Class CSIS 1410-003-Sp17
 */
public class Rectangle {
	//two private final ints of length and width
	private final int length;
	private final int width;

	//Rectangle constructor that takes in two ints and assigns the to length and width
	public Rectangle(int l, int w) {
		this.length = l;
		this.width = w;
	}
	
	//getLength method that returns an int from the length variable
	public int getLength() {
		return length;
	}

	//getWidth method that returns an int from the width variable
	public int getWidth() {
		return width;
	}
	
	//Overridden toString method that returns a string with the length and width variables
	@Override
	public String toString() {
		return "Rectangle (" + getLength() + " x " + getWidth() + ")";
	}

}
