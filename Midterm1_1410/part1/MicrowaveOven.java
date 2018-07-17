package part1;

public class MicrowaveOven extends Oven {
	
	private int power;
	
	public MicrowaveOven(double s, int p) {
		super(s);
		this.power = p;
	}

	public String autoDefrost() {
		return "defrosting ...";
	}
	
	@Override
	public String heatFood() {
		return "heating food using microwaves";
	}
	
	public String toString() {
		return super.toString() + power + "Watt";
	}
}
