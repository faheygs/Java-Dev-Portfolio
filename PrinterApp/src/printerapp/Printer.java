package printerapp;

public abstract class Printer {
	private int serialNumber;
	
	public Printer(int number) {
		this.serialNumber = number;
	}
	
	public abstract void Print();
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " #" + serialNumber;
	}
}
