package a01;
/**
 * @author Gavin Fahey
 * Class CSIS 1410-003-Sp17
 * Date January 30th, 2016
 */
import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
	//This variable is used to keep while loop going until changed to 0
	static 	int run = 1;
	
	//Scanner input used to receive input from the user
	static Scanner input = new Scanner(System.in);
	
	
	/**
	 * This Method is used to print the Main Menu the user sees when starting
	 * the program and continues to see to make choices during the duration
	 * of the program
	 */
	private static void PrintMenu() {
		System.out.println("**********\nMain Menu\n**********");
		System.out.println("1. Add a student");
		System.out.println("2. Find a student");
		System.out.println("3. Delete a student");
		System.out.println("4. Display all students");
		System.out.println("5. Display the total number of the students");
		System.out.println("6. Exit");
		System.out.print("\nEnter your choice: ");
	}
	
	/**
	 * This is a mini menu I decided to create so after a user has completed one of the
	 * choices from the main menu it asks if they would like to continue or end the program.
	 */
	private static void MiniMenu() {
		//prompt the user to input 1 or 0 to either continue or end the program.
		System.out.println("Continue To Main Menu? (1 to continue / 0 to exit program)");
		System.out.print("Enter Choice: ");
		int userPrompt = input.nextInt();
		
		//switch case for the user if they enter 1 it continues to main menu
		//if the user enters 0 it ends the program.
		switch(userPrompt) {
		case 0: run = 0;
				break;
		case 1: run = 1;
				break;
		default: System.out.println("\nInvalid input, please try again.\n");
				 MiniMenu();
				 break; 
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		//Initializing my Student ArrayList
		ArrayList<Student> stu = new ArrayList<>();
		
		//Automatically adding in three Students into the Student ArrayList
		//On program start
		stu.add(new Student("Joe", "Montana", "EE", 3.5));
		stu.add(new Student("Carl", "Lang", "CS", 3.1));
		stu.add(new Student("Susan", "Smith", "FA", 4.0));
		
		//While loop that continues the program until run becomes equal to 0
		while(run == 1) {
			//PrintMenu calls the menu to be printed to screen
			PrintMenu();
			//user input for making a choice is stored into menuChoice
			int menuChoice = input.nextInt();
			input.nextLine();
			System.out.println();
			
			//Switch statement that runs the choice the user selects from the main menu
			switch(menuChoice) {
				// case 1 calls the AddStudent method for adding a student to Student ArrayList
				case 1: AddStudent(stu);
						break;
				// case 2 call the FindStudent method for finding a student in the Student ArrayList
				case 2: FindStudent(stu);
						break;
				// case 3 calls the DeleteStudent method for finding and deleting a student from
				// the Student ArrayList
				case 3: DeleteStudent(stu);
						break;
				// case 4 calls the DisplayStudents method for printing out all students
				// inside the Student ArrayList
				case 4: DisplayStudents(stu);
						break;
				// case 5 calls the TotalStudents method for printing the number of students found
				// inside the Student ArrayList
				case 5: TotalStudents(stu);
						break;
				// case 6 stores the value 0 inside run and ends the while loop which exits the program
				case 6: System.exit(0);
						break;
				// The default case prints out invalid input if user inputs an invalid option
				default: System.out.println("Invalid input, please try again.\n");
						break;
			}
			//The MiniMenu prints a small menu prompting the user to continue or exit
			MiniMenu();
		}
	}
	
	/**
	 * 
	 * @param students
	 * The AddStudent method takes in an ArrayList and takes all the user input and creates 
	 * a new student to be used inside the Student ArrayList
	 */
	private static void AddStudent(ArrayList<Student> students) {
		System.out.print("Enter First Name: ");
		String tempFname = input.nextLine();
		
		System.out.print("Enter Last Name: ");
		String tempLname = input.nextLine();
		
		System.out.print("Enter Major: ");
		String tempMaj = input.nextLine();
		
		System.out.print("Enter GPA: ");
		double tempGpa = input.nextDouble();
		System.out.println();
		
		students.add(new Student(tempFname, tempLname, tempMaj, tempGpa));
		
		System.out.println("***************************\n" + tempFname + " " + tempLname + " has been added.\n"
				+ "***************************\n");
	}
	
	/**
	 * 
	 * @param students
	 * The FindStudent method takes in an ArrayList and loops through it until the user input of snum
	 * is found and than proceeds to print out the result to the screen
	 */
	private static void FindStudent(ArrayList<Student> students) {
		System.out.print("Search Student by their S number: S");
		int snum =  input.nextInt();
		System.out.println();

		for (int i = 0; i <= students.size() -1; i++) {
			if(students.get(i).getsNumber() == snum) {
				System.out.println("*********************************\n" + students.get(i).toString() 
						+ "\n*********************************\n");
			}
		}
	}
	
	/**
	 * 
	 * @param students
	 * The DeleteStudent method takes in an ArrayList and based on the user input of snum and
	 * loops through the ArrayList and removes that student associated with that snum from the 
	 * Student ArrayList
	 */
	private static void DeleteStudent(ArrayList<Student> students) {
		System.out.print("Delete Student by their S number: S");
		int snum =  input.nextInt();
		System.out.println();

		for (int i = 0; i <= students.size() -1; i++) {
			if(students.get(i).getsNumber() == snum) {
				System.out.println("*************************\n" + "Student has been Deleted."
						+ "\n*************************\n");
				students.remove(i);
			}
		}
	}
	
	/**
	 * 
	 * @param students
	 * The DisplayStudents takes in an ArrayList and as it loops through it prints to the screen 
	 * the position of i in the ArrayList, which displays all the students in the Student ArrayList
	 */
	private static void DisplayStudents(ArrayList<Student> students) {
		
		System.out.print("************************************\n");
		for (int i = 0; i <= students.size() -1; i++) {
			
			System.out.println(i + 1 + ". " + students.get(i).toString());
			
		}	
		System.out.println("************************************\n");
	}
	
	/**
	 * 
	 * @param students
	 * The TotalStudents method takes in an ArrayList and finds the size of the 
	 * Student ArrayList and prints out the size as a number
	 */
	private static void TotalStudents(ArrayList<Student> students) {
		System.out.print("*********************\n");
		System.out.println("There are " + students.size() + " students.");
		System.out.println("*********************\n");
	}
}
