package a04;
/**
 * 
 * @author Gavin Fahey
 * @date Feb 15, 2017
 * Class CSIS 1410-003-Sp17
 */
public class InterfaceApp {

	public static void main(String[] args) {
		
		//Array type of Shape to store in my eight different shapes and their appropriate size
		Shape[] s = {new Rectangle(6,3), new Rectangle(5,4), new Square(4), new Square(3),
				new IsoscelesRightTriangle(5), new IsoscelesRightTriangle(3), 
				new Circle(7), new Circle(2)};
		
		//Output with "Shape Array"
		System.out.println("Shape Array: \n------------");
		
		//For each loop going through the previously initialized array of Shape
		for(Shape sh: s) {
			
			//Checking to see if the shape is a instance of Printable and if so
			//Print the shape along with information
			if(sh instanceof Printable) {
				//Output the shape and size of the shape
				System.out.println(sh.toString());
				//Output the perimeter of the shape
				System.out.printf("Perimeter: %.1f%n", sh.perimeter());
				//Output the area of the shape
				System.out.printf("Area: %.1f%n%n", sh.area());
				//Print to the screen the outline of the shape
				((Printable) sh).print();
				System.out.println();
			  //If the shape is not an instance of Printable display the information
			  //of the shape but it wont draw the shape on the screen
			} else {
				//Output the shape and size of the shape
				System.out.println(sh.toString());
				//Output the perimeter of the shape
				System.out.printf("Perimeter: %.1f%n", sh.perimeter());
				//Output the area of the shape
				System.out.printf("Area: %.1f%n%n", sh.area());
			}
		}
	}

}
