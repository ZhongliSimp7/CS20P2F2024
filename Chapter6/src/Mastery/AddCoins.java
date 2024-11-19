/*

Program: AddCoins.java          Date: October 9th, 2024


Purpose: Calculates the total money the user has based on the coins of each type 


School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.*;

public class AddCoins {

	public static void getDollarAmount() { 
		
		// Declaration and Initiation, preparing for input
		Scanner Input = new Scanner(System.in);
		System.out.println("Enter the total coins of each type - ");
		System.out.println("");
		
		System.out.print("Quarters - ");
		int noQuarters = Input.nextInt();
		System.out.print("Dimes - ");
		int noDimes = Input.nextInt();
		System.out.print("Nickels - ");
		int noNickels = Input.nextInt();
		System.out.print("Pennies - ");
		int noPennies = Input.nextInt();
		System.out.println("");
		
		// Specifying the value of each type of coin 
		double quarter = 0.25;
		double dime = 0.10;
		double nickel = 0.05;
		double penny = 0.01;
		
		// Total value should be the number of each type of coin times its value
		// And then adding that together
		double total = (noQuarters * quarter) + (noDimes * dime) + 
					   (noNickels * nickel) + (noPennies * penny);
		
		// Displays the final value 
		System.out.println("Total value is $" + total);
		
	}
	
	// Main() method executes getDollarAmount() method
	public static void main(String[] args) {
		
		getDollarAmount();
		
	}
}

/*

Screen Dump (2 Test Cases) - 

Enter the total coins of each type - 

Quarters - 2
Dimes - 3
Nickels - 4
Pennies - 5

Total value is $1.05


Enter the total coins of each type - 

Quarters - 4
Dimes - 0
Nickels - 1
Pennies - 2

Total value is $1.07

*/
