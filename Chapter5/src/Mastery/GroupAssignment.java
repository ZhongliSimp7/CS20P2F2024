/*

Program: GroupAssignment.java          Date: October 2nd, 2024


Purpose: Asks the user for their name and then assigns them to a group accordingly


School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.*;

public class GroupAssignment {

	public static void main(String[] args) {
	
		// Declaration and initiation, asks for user's name 
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter your first name - ");
		var firstName = Input.next();
		System.out.print("Enter your last name - ");
		var lastName = Input.next();
		String lastNam = lastName.toUpperCase();
		// Char type used since it's only a single letter
		char initial = (lastNam.charAt(0));
		// Converts it to a string for comparison later on 
		String init = String.valueOf(initial);
		
		int groupNum = 0;
		
		// Creating some more strings for comparing later on
		String group1 = "I";
		String group2 = "S";
		String group3 = "Z";
		
		// If the init's value is less than that of or equal to group 1, sets groupNum to 1
		if (init.compareTo(group1) <= 1) {
			groupNum = 1;
		}
		
		// Else if it's less than S, sets groupNum to 2
		else if (init.compareTo(group2) <= 1) {
			groupNum = 2;
		}
		
		// Used else if instead of else just to remove the error with group3 being unused
		else if (init.compareTo(group3) <= 1){
			groupNum = 3;
		}
		
		// Final output statement 
		System.out.println(firstName + " " + lastName + " is assigned to Group " + groupNum);
		
	}
}

/*

Screen Dump (2 Test Cases) - 

Enter your first name - Vedant
Enter your last name - Yadav
Vedant Yadav is assigned to Group 3

Enter your first name - Joe 
Enter your last name - Biden
Joe Biden is assigned to Group 1

*/