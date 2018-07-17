package a03;

/**
 * 
 * @author Gavin Fahey
 * @date Feb 8, 2017
 * Class CSIS 1410-003-Sp17
 */
public class InheritanceApp {

	public static void main(String[] args) {
		//Instances being made of the classes Rectangle, Square, IsoscelesRightTriangle and Circle
		Rectangle r = new Rectangle(5, 4);
		Square s = new Square(4);
		IsoscelesRightTriangle i = new IsoscelesRightTriangle(5);
		Circle c = new Circle(4);
		
		//Printing out the methods from the Rectangle class
		System.out.println(r.toString());
		System.out.println("Length: " + r.getLength());
		System.out.println("Width: " + r.getWidth());
		System.out.println();
		
		//Printing out the methods from the Square class
		System.out.println(s.toString());
		System.out.println("Side: " + s.getSide());
		System.out.println();
		
		//Printing out the methods from the IsoscelesRightTriangle class
		System.out.println(i.toString());
		System.out.println("Leg: " + i.getLeg());
		System.out.printf("Hypotenuse: %.1f%n", i.hypotenuse());
		System.out.println();
		
		//Printing out the methods from the Circle class
		System.out.println(c.toString());
		System.out.println("Diameter: " + c.diameter());
		System.out.printf("Circumference: %.1f%n", c.circumference());
		System.out.println("Radius: " + c.getRadius());
		System.out.println();
		
		//Creating a variable of type Rectangle and passing it the instance made of Square
		Rectangle rectangle2 = s;
		
		//Printing out the rectangle2 variable that has been passed into the Rectangle methods
		System.out.println("Rectangle2:");
		System.out.println("-----------");
		System.out.println(rectangle2);
		System.out.println("Length: " + rectangle2.getLength());
		System.out.println("Width: " + rectangle2.getWidth());
		System.out.println();
		
		
		//Printing out Rectangle Array
		System.out.println("Rectangle Array:");
		System.out.println("----------------");
		
		//Creating an Array of type Rectangle and storing in the values of rectangle2, Square and Rectangle
		Rectangle[] rectangles = new Rectangle[] {rectangle2, s, r};
		
		//foreach loop that goes through Rectangle Array and prints out the values
		for(Rectangle rect: rectangles) {
			System.out.println(rect);
			System.out.println("Length: " + rect.getLength());
			System.out.println("Width: " + rect.getWidth());
			System.out.println();
		}
	}
}
