package printerapp;

public class PrinterApp {

	public static void main(String[] args) {
		InkjetPrinter ip = new InkjetPrinter(1234567);
		LaserPrinter tp = new LaserPrinter(2345678);
		
		System.out.println(ip);
		System.out.println("Remaining Cartridge: " + ip.getRemainingCartridge() + "%\n");
		
		System.out.println(tp);
		System.out.println("Remaining Toner: " + tp.getToner() + "%\n");
		
		System.out.println("Array of Printers:\n");
		
		Printer[] p = {ip, tp};
		
		for(Printer print: p) {
			System.out.println(print);
			print.Print();
			print.Print();
			System.out.println();
		}
				
	}

}
