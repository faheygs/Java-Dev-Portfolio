package labCoin;

public enum Coin {
	CENT(2.500,19.05), NICKEL(5.000,21.21), DIME(2.268,17.91), QUARTER(5.670,24.26);
	
	private final double weight;
	private final double diameter;
	
	private Coin(double w, double d) {
		diameter = d;
		weight = w;
	}
	
	@Override
	public String toString() {
		String money = super.toString();
		return money + " Weight: " + weight + " Diameter: " + diameter;
	}
}
