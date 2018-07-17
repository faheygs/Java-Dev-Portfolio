package labfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MountainApp {

   public static void main(String[] args) throws FileNotFoundException {
      List<Mountain> mountainList = new LinkedList<Mountain>();
      Scanner input = new Scanner(MountainApp.class.getResourceAsStream("Mountains.csv"));
	
	 Mountain newMountain;
	
	 while (input.hasNextLine()) {
	    newMountain = getMountain(input.nextLine());
	    if (newMountain != null){
	       mountainList.add(newMountain);
	    }
	 
	 }
	 input.close();
   	
      for(Mountain el : mountainList) {
         System.out.println(el.toString());
      }
   	
   }

   private static Mountain getMountain(String nextLine) {
      try{
         String[] parts = nextLine.split(",");
         return new Mountain(parts[0],Integer.parseInt(parts[1]), Boolean.parseBoolean(parts[2]));
      	
      } 
      catch(Exception e) {
         System.err.println(nextLine + "Could not be read in as a mountain\n");
         return null;
      	
      }
   }
}