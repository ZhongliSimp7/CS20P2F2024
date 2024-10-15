/*

Program: PrimeNumber.java          Date: October 9th, 2024


Purpose: 


School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void isPrime() {
		// Declaration and initiation, asking for input 
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter a number - ");
		int num = Input.nextInt();
		int checker = 1;
		boolean ans;
		
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

	public static void main(String[] args) {
		
		isPrime();
		
	}
}