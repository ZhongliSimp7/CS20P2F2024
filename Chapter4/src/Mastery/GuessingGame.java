/*

Program: GuessingGame.java          Date: September 24th, 2024


Purpose: Create a secret number between 1 and 20 which the user tries to guess 


School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

// Scanner class for user input
import java.util.*;

public class GuessingGame {

	public static void main(String[] args) {
		
		// Declaration of a few classes and an integer  
		Scanner Input = new Scanner(System.in);
		Random num = new Random();
		int secretNum = num.nextInt(20) + 1;
		
		// Prompting the user for a number
		System.out.print("Guess the secret number (between 1 and 20) ");
		int userAns = Input.nextInt();
		int diff = secretNum-userAns;
		System.out.println("The correct number was " + secretNum + "");
		
		// Conditional statement, if the numbers match, user wins
		if (diff == 0) {
			System.out.println("You won!");
		}
		else {
			System.out.println("Better luck next time!");
		}

	}
}

/*

Screen Dump (2 Test Cases) - 


Guess the secret number (between 1 and 20) 1
The correct number was 1.
You won!

Guess the secret number (between 1 and 20) 10
The correct number was 2. 
Better luck next time!

*/