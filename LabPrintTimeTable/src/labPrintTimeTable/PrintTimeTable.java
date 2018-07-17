package labPrintTimeTable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintTimeTable {

	public static void main(String[] args) throws IOException {
		PrintTimeTable();
	}
	
	private static void PrintTimeTable() {
		try {
			File f = new File("Lab Print Time Table");
			PrintWriter pw = new PrintWriter("src/labPrintTimeTable/TimesTable.txt");
			
			pw.println("\tTimes Table:\n");
			for (int i = 1; i <= 10; i += 2)
			{
			    for (int j = 1; j <= 10; j++)
			    {

//				System.out.printf("%-2d * %-2d = %-2d", j, i, i * j);
//				System.out.printf("%10d * %d = %d\n", j, i + 1, j * (i + 1));

				pw.printf("%-2d * %-2d = %-2d", j, i, i * j);
				pw.printf("%10d * %d = %d\n", j, i + 1, j * (i + 1));
			    }
//			    System.out.println("");

			    pw.println("");
			}
			
			pw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
