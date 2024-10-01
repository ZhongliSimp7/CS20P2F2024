/*

Program: MathTutor.java          Date: September 24th, 2024


Purpose: Creates a random arithmetic problem for the user to solve  


School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.text.DecimalFormat;
// Scanner class for user input 
import java.util.*;

public class MathTutor {

	public static void main(String[] args) {
		
		// Declaration of Scanner and Random classes, alongside some integers and doubles
		Scanner Input = new Scanner(System.in);
		Random num = new Random();
		int x = num.nextInt(10) + 1;
		int y = num.nextInt(10) + 1;
		int z = num.nextInt(4) + 1;

		double answer;
		
		// DecimalFormat to shorten the answer during division problems 
		DecimalFormat ansShorten = new DecimalFormat("#.00");
		
		// Switch statement for all 4 operations 
		switch (z) {
		
			// Addition -  Adds numbers, and checks if user answer is the same 
			case 1: answer = (x+y); System.out.print("What is " + x + "+" + y + "? ");
					int userAns = Input.nextInt(); 
					if (userAns == (int)answer) {
						System.out.println("You are correct!");
					}
					else {
						System.out.println("The correct answer is " + answer + ". Try again");
					}
					break;
					
			// Subtraction - Subtracts numbers, and checks answer
			case 2: answer = (x-y); System.out.print("What is " + x + "-" + y + "? ");
					userAns = Input.nextInt(); 
					if (userAns == (int)answer) {
						System.out.println("You are correct!");
					}
					else {
						System.out.println("The correct answer is " + answer + ". Try again");
					}
					break;
					
			// Multiplication - Multiplies numbers and checks answer 
			case 3: answer = (x*y); System.out.print("What is " + x + "*" + y + "? ");
					userAns = Input.nextInt();
					if (userAns == (int)answer) {
						System.out.println("You are correct!");
					}
					else {
						System.out.println("The correct answer is " + answer + ". Try again");
					}
					break;
					
			// Division - Divides the numbers and then formats it to two decimal places
			// Then we parse it to a double to make it possible to compare the two values 
			case 4: answer = ((double)x/(double)y); System.out.print("What is " + x + "/" + y + "? (round to 2 decimal places) ");
					Double userAns2 = Input.nextDouble();					
					if (userAns2 == Double.parseDouble(ansShorten.format(answer))) {
						System.out.println("You are correct!");
					}
					else {
						System.out.println("The correct answer is " + ansShorten.format(answer) + ". Try again");
					}
					break;
		}
		
	}
}


/*

Screen Dump (Two Test Cases) - 

What is 4-3? 1
You are correct!

What is 10/3? (round to 2 decimal places) 3.33
You are correct!

*/
