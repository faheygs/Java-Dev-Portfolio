package a04;

/**
 * 
 * @author Gavin Fahey
 * @date Feb 15, 2017
 * Class CSIS 1410-003-Sp17
 */
public class Rectangle implements Shape, Printable{
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

	//This print method takes the size of the rectangle/square and 
	//creates an outline of that rectangle/square
	@Override
	public void print() {
		for(int i = 0; i < getWidth(); i++) {
			System.out.print("o ");
			for(int j = 0; j < getLength() -2; j++) {
				if(i == 0 || i == getWidth() -1) {	
					System.out.print("o ");
				} else {
					System.out.print("  ");
				}	
			}	
			System.out.print("o ");
			System.out.println();
		}
	}

	//Perimeter method returns the perimeter of the rectangle or square
	@Override
	public double perimeter() {
		return (length * 2) + (width * 2);
	}

	//Area method that returns the area of the rectangle or square
	@Override
	public double area() {
		return length * width;
	}

}
