package a04;

/**
 * 
 * @author Gavin Fahey
 * @date Feb 15, 2017
 * Class CSIS 1410-003-Sp17
 */
public class Circle implements Shape {
	//private final integer named radius
	private final int radius;
	
	//Circle constructor receiving in one variable and assigning it to radius
	public Circle(int r) {
		this.radius = r;
	}
	
	//diameter method returning an integer of the radius * 2
	public int diameter() {
		return getRadius() * 2;
	}
	
	//circumference method returning a double of 2 * Math.PI * radius
	public double circumference() {
		return 2 * Math.PI * getRadius();
	}
	
	//a getter for returning the value radius
	public int getRadius() {
		return radius;
	}
	
	//toString method to return a string with the variable radius
	public String toString() {
		return "Circle (" + getRadius() + ")"; 
	}

	//Perimeter method to return the circumference of the circle
	@Override
	public double perimeter() {
		return circumference();
	}

	//Area method to return the area of the circle
	@Override
	public double area() {
		return Math.PI * getRadius() * getRadius();
	}
}
