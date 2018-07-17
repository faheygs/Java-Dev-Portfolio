package part1;

public class ConvectionOven extends Oven {

	public ConvectionOven(double s) {
		super(s);
	}

	@Override
	public String heatFood() {
		return "heating food by circulating hot air";
	}
}
