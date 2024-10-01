/*

Program: QuadraticEquations.java          Date: September 25th, 2024


Purpose: Solves for the roots of a quadratic equation  


School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.*;

public class QuadraticEquations {

	public static void main(String[] args) {
		
		// Declaration and Initiation, taking in input 
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter the value of a - ");
		int a = Input.nextInt();
		System.out.print("Enter the value of b - ");
		int b = Input.nextInt();
		System.out.print("Enter the value of c - ");
		int c = Input.nextInt();
		
		// Separated the equation into two steps for the code to be easier to understand
		// Also makes it less likely for errors to occur with brackets
		double x = (Math.pow(b, 2)) - (4*a*c) ;
		double y = (-b - Math.sqrt(x))/(2*a);
		double z = (-b + Math.sqrt(x))/(2*a);
		
		// Displays the value of the two roots 
		System.out.println("The roots of the equation are " + y + " and " + z);
		
	}
}


/* 

Screen Dump (2 Test Cases) - 

Enter the value of a - 1
Enter the value of b - -5
Enter the value of c - 6
The roots of the equation are 2.0 and 3.0

Enter the value of a - 5
Enter the value of b - 10
Enter the value of c - 2
The roots of the equation are -1.7745966692414832 and -0.2254033307585166

*/