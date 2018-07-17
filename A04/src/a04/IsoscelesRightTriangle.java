package a04;

/**
 * 
 * @author Gavin Fahey
 * @date Feb 8, 2017
 * Class CSIS 1410-003-Sp17
 */
public class IsoscelesRightTriangle implements Shape, Printable {
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
		return "IsoscelesRightTriangle (" + getLeg() + ")";
	}

	@Override
	public void print() {
		
		for(int i = 1; i <= getLeg(); i++) {
			for(int j = 1; j <= i; j++) {			
				if(i == 1 || i == getLeg()) {				
				System.out.print("o ");		
				} else if (j == 1 || j == getLeg()) {			
					System.out.print("o ");		
				} else if (j == i) {		
					System.out.print("o ");	
				} else {	
					System.out.print("  ");	
				}
			}
			System.out.println();
		}
	}

	@Override
	public double perimeter() {
		return leg + leg + hypotenuse();
	}

	@Override
	public double area() {
		return (leg * leg) / 2;
	}
}
