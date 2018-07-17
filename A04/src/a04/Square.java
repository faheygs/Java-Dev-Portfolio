package a04;

//Square being extended to the Rectangle class
public class Square extends Rectangle implements Shape, Printable {

	//Square constructor taking in an int and passing it to the Rectangle constructor
	public Square(int x) {
		super(x, x);
	}
	
	//getSide method that return the Rectangle getLength method as an int
	public int getSide() {
		return super.getLength();
	}
	
	//toString method that returns a string with the value associated with getSide
	public String toString() {
		return "Square (" + getSide() + ")";
	}
}
