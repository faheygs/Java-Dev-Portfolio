package printerapp;

public class LaserPrinter extends Printer {
	
	private int remainingToner;
	
	public LaserPrinter(int sNumber) {
		super(sNumber);
		remainingToner = 100;
	}
	
	public int getToner() {
		return remainingToner;
	}

	@Override
	public void Print() {
		if(remainingToner > 0) {
			remainingToner -= 10;
			System.out.println(this.getClass().getSimpleName() + " is printing. Remaining Toner: "
					+ remainingToner + "%");
		} else if(remainingToner == 0) {
			System.out.println("The Toner is empty");
		}
	}
}
