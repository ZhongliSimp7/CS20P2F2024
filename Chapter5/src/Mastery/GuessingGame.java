/*

Program: GuessingGame.java          Date: October 2nd, 2024


Purpose: Create a secret number between 1 and 20 which the user tries to guess (multiple tries)


School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.Random;
import java.util.Scanner;

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
				// System.out.println("The correct number was " + secretNum + "");
				
				// Conditional statement, if the numbers match, user wins
				if (diff == 0) {
					System.out.println("You won!");
				}
				
				// If the user does not get it correct on the first try -
				else {
					// Boolean variable 
					boolean playAgain = true;
					// As long as playAgain is true, while loop continues
					while (playAgain == true) {
						System.out.print("Try guessing the number again (between 1 and 20) ");
						userAns = Input.nextInt();
						// If user gets it correct, sets playAgain to false, breaking the loop
						if (userAns == secretNum) {
							System.out.println("You won!");
							playAgain = false;
						}
					} // While loop bracket
				} // Else statement bracket
				
	}
}


/*

Screen Dump (2 Test Cases) - 

Guess the secret number (between 1 and 20) 1
Try guessing the number again (between 1 and 20) 2
Try guessing the number again (between 1 and 20) 8
Try guessing the number again (between 1 and 20) 12
Try guessing the number again (between 1 and 20) 19
You won!

Guess the secret number (between 1 and 20) 17
Try guessing the number again (between 1 and 20) 16
Try guessing the number again (between 1 and 20) 14
You won!

*/