/*

Program: PrimeNumber.java          Date: October 9th, 2024


Purpose: Accepts a number from the user and checks if it's prime or not 


School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.Scanner;

public class PrimeNumber { 
	
	public static boolean isPrime(int num) {
		
		// Creates a for loop which executes until checker is equal to the num 
		for (int i = 2; i < num; i++) {
			// If the remainder when dividing is ever 0, the number is not prime 
			if ((num % i) == 0) {
				return(false); }
		}
		
		// returns true in case it did not return false earlier 
		return true;
	}

	public static void main(String[] args) {
		
		// Declaration and initiation, asking for input 
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter a number - ");
		int num = Input.nextInt();

		// Boolean ans carries the value returned by isPrime()
		boolean ans = isPrime(num);
		// If the value returned was false, the number is not prime
		if (ans == false) {
			System.out.println("The number is not prime ");
		}
		// Else it is prime
		else {
			System.out.println("The number is prime ");
		}
		
	}
}

/*

Screen Dump (2 Test Cases) - 

Enter a number - 10201
The number is not prime 

Enter a number - 103
The number is prime 

*/
