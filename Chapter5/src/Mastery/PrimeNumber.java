/*

Program: PrimeNumber.java          Date: October 2nd, 2024


Purpose: Prompts the user for a number and checks if that number is prime or not 


School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

// Importing utility package for Scanner class 
import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		
		// Declaration and initiation, asking for input 
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter a number - ");
		int num = Input.nextInt();
		int checker = 1;
		
		// Creates a while loop which executes until checker is equal to the num 
		while (checker < num) {
			checker += 1;
			// If the remainder when dividing is ever 0, the number is not prime 
			if ((num % checker) == 0) {
				System.out.println("The number is not prime");
				break; }
			// Otherwise it is prime 
			else {
				System.out.println("The number is prime"); 
				break; }
		}
		
	}
}

/* 

Screen Dump (2 test cases) - 

Enter a number - 64
The number is not prime

Enter a number - 293
The number is prime

*/