/*

Program: DigitExtractor.java          Date: November 19th, 2024


Purpose: Takes in a number and then gives the user choices to view individual digits  


School: CHHS
Course: Computer Science 20
 
*/

package Mastery;
import java.util.*;

public class DigitExtractorClient {

	public static void main(String[] args) {
		
		DigitExtractor CoolObject =  new DigitExtractor();// Object here
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter a three-digit number - ");
		int number = Input.nextInt(); // Records the inputted integer
		System.out.println("Show the (N)umber");
		System.out.println("Show the (O)nes place number");
		System.out.println("Show the (T)ens place number");
		System.out.println("Show the (H)undreds place number");
		System.out.println("(Q)uit");
		String choice; // Declares String choice here
		
		CoolObject.setNumber(number); // setNumber() function accepts the integer value
		
		do {
			System.out.print("Enter your choice - ");
			choice = Input.next(); // Records the users choice
			
			// Based off of their choice, runs different lines of code
			if (choice.equalsIgnoreCase("N")) {
				System.out.println(number); 
			}
			else if (choice.equalsIgnoreCase("O")) {
				System.out.println(CoolObject.ones());
			}
			else if (choice.equalsIgnoreCase("T")) {
				System.out.println(CoolObject.tens());
			}
			else if (choice.equalsIgnoreCase("H")) {
				System.out.println(CoolObject.hundreds());
			}
			else { // If the input is anything apart from the above letters, breaks the loop
				break;
			}
		} while (choice != "Q" || choice != "q");	
	}
}


/* 

Screen Dump (2 Test Cases) - 


Enter a three-digit number - 123
Show the (N)umber
Show the (O)nes place number
Show the (T)ens place number
Show the (H)undreds place number
(Q)uit
Enter your choice - N
123
Enter your choice - O
3
Enter your choice - T
2
Enter your choice - H
1
Enter your choice - Q


Enter a three-digit number - 745
Show the (N)umber
Show the (O)nes place number
Show the (T)ens place number
Show the (H)undreds place number
(Q)uit
Enter your choice - N
745
Enter your choice - O
5
Enter your choice - T
4
Enter your choice - H
7
Enter your choice - Q


*/