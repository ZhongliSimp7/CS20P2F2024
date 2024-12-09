/*

Program: EvensAndOdds.java          Date: December 9th, 2024


Purpose: Creates a character array of user inputted text and checks if it's a palindrome  


School: CHHS
Course: Computer Science 20
 
*/

package Mastery;
import java.util.*;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter a string - ");
		// Turns all text to lowercase for checking and removes spaces
		String text = Input.nextLine().replaceAll(" ", "").toLowerCase();
		
		
		// Changes text to a character array 
		char[] charArray = text.toCharArray();
		boolean answer = true;
		
		int left = 0;
        int right = charArray.length - 1; // Final index value
        
        while (left < right) {
        	// If any left character is not equal to the right character
        	// sets answer as false
            if (charArray[left] != charArray[right]) {
                answer = false;
                break;
            }
            left++;
            right--;
        }
        
        // Display the result
        if (answer == true) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is not a palindrome.");
        }
	
	}
}


/* 

Screen Dump (2 Test Cases) - 

Enter a string - radar
radar is a palindrome.

Enter a string - god saw i was dog
godsawiwasdog is a palindrome.

*/
