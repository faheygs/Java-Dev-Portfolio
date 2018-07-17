package midterm2;
/*
 * Gavin Fahey
 * CSIS 1410
 * March 29th, 2017
 * Midterm 2
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise1 {
	public static void main(String[] args) {
		//creating a string of random characters
	    String s = "a@bc#$";
	    //creating an array of the String s as characters
	    char[] chars = s.toCharArray();
	    //creating a single character variable
	    char item = '&';
	    
	    //Character List that loops through char array and stores it in the Character List
	    List<Character> listC = new ArrayList<Character>();
	    for (char c : chars) {
	        listC.add(c);
	    }
	    
	    //prints out the contents of listC Array
	    System.out.println("List: " + listC);
	    
	    //If statement that checks if the previous declared variable item is found in the 
	    //Character List and if not it prints it is not otherwise it is found
	    if(listC.contains(item)) {
	    	System.out.println("The Element " + item + " is a part of the list.");
	    } else {
	    	System.out.println("The Element " + item + " is not part fo the list." );
	    }
	    
	    //This takes the second position and the last position of the Character List
	    //and swaps those character positions in the array
	    Collections.swap(listC, 1, listC.size()-1);
	    
	    //Prints out the newly formed listC array
	    System.out.println("List: " + listC);
	    
	    //checks whether or not each character found in listC is a letter
	    //or not and prints true or false depeding on what it finds
	    for (char el: listC) {
	    	System.out.print(Character.isLetter(el) + " ");
	    }
	}
}