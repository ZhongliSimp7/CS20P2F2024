/*

Program: LunchOrder.java          Date: November 21th, 2024


Purpose: Asks the user for their order, displays nutritional info and the total cost 


School: CHHS
Course: Computer Science 20
 
*/


package Mastery;
import java.util.*;

public class LunchOrderClient {

	public static void main(String[] args) {
		
		LunchOrder Food = new LunchOrder(); 
		Scanner Input = new Scanner(System.in);
		System.out.println("Welcome to Lunch Order");
		
		System.out.print("Enter the number of hamburgers - ");
		int numHam = Input.nextInt();
		Food.Ham(numHam);
		
		System.out.print("Enter the number of salads - ");
		int numSal = Input.nextInt();
		Food.Salad(numSal);
		
		System.out.print("Enter the number of french fries - ");
		int numFre = Input.nextInt();
		Food.Fries(numFre);
		
		System.out.print("Enter the number of sodas - ");
		int numSod = Input.nextInt();
		Food.Soda(numSod);
		
		System.out.println("Your order comes to " + Food.Total());
		
		
		/*
		 * System.out.println("Each hamburger has  of fat,  of carbs, and  of fiber");
		 * System.out.println("Each salad has  of fat,  of carbs, and  of fiber");
		 * System.out.println("French fries have  of fat,  of carbs, and  of fiber");
		 * System.out.println("Each soda has  of fat,  of carbs, and  of fiber");
		 */
	}
}

/* 

Screen Dump (2 Test Cases) - 



*/