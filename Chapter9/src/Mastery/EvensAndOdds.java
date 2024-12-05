/*

Program: EvensAndOdds.java          Date: December 5th, 2024


Purpose: Creates an array with random integers and prints out the odd/even values  


School: CHHS
Course: Computer Science 20
 
*/

package Mastery;
import java.util.*;

public class EvensAndOdds {

	public static void main(String[] args) {
		
		// Declaration and initiation and creating the arrays 
		Random number = new Random();
		int max = 99, min = 0;
		int[] numbers = new int[25];
		 
		// A for loop to generate random numbers and fill in the arrays
		for (int i = 0; i < 25; i++) {
			int x = number.nextInt(max - min + 1) + min;
			numbers[i] = x;
		}
		
		// Prints out the odd numbers in the array
		System.out.println("ODD - ");
		for (int i = 0; i < 25; i++) {
			if (numbers[i] % 2 == 1) {
			System.out.print(numbers[i] + " ");
			}
		}
			
		System.out.println("");
		
		// Prints out the even numbers in the array
		System.out.println("EVEN - ");
		for (int i = 0; i < 25; i++) {
			if (numbers[i] % 2 == 0) {
			System.out.print(numbers[i] + " ");
			}
		}
	}
}

/* 

Screen Dump (2 Test Cases) - 

ODD - 
7 25 41 73 87 37 7 23 23 33 57 43 
EVEN - 
62 68 56 16 48 44 6 14 24 30 96 8 36 

ODD - 
87 63 35 59 63 25 
EVEN - 
0 86 60 2 34 70 18 68 22 62 84 40 2 16 90 28 52 92 10 

*/