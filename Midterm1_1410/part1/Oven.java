package part1;

public abstract class Oven {
	
	private double size;
	
	public Oven(double s) {
		this.size = s;
	}
	
	public abstract String heatFood();

	public String toString() {
		return getClass().getSimpleName() + " " + size + "ft3 ";
	}
}
