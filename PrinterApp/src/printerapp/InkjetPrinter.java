package printerapp;

public class InkjetPrinter extends Printer {

	private int remainingCartridge;
	
	public InkjetPrinter(int sNumber) {
		super(sNumber);
		remainingCartridge = 100;
	}
	
	public int getRemainingCartridge() {
		return remainingCartridge;
	}

	@Override
	public void Print() {
		if(remainingCartridge > 0) {
			remainingCartridge -= 10;
			System.out.println(this.getClass().getSimpleName() + " is printing. Remaining Cartridge: "
					+ remainingCartridge + "%");
		} else if(remainingCartridge == 0) {
			System.out.println("The Cartridge is empty");
		}
	}

}
