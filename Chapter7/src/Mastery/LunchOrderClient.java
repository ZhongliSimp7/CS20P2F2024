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
		
		// Creating the object
		LunchOrder Food = new LunchOrder(); 
		Scanner Input = new Scanner(System.in);
		System.out.println("Welcome to Lunch Order");
		
		// Asks user for a prompt for how many burgers they would like
		// Then it displays the nutritional info after feeding all the values into Food.Ham()
		System.out.print("Enter the number of hamburgers - ");
		double numHam = Input.nextDouble();
		Food.Ham(numHam, 9.0, 33.0, 1.0);
		System.out.print("Each hamburger has " + Food.HamFat() + "g of fat, ");  
		System.out.print(Food.HamCarb() + "g of carbs, and " + Food.HamFibre() + " of fiber \n");
		System.out.println("");
		
		// Similar thing here, continuing for each type of food item
		System.out.print("Enter the number of salads - ");
		double numSal = Input.nextDouble();
		Food.Salad(numSal, 1.0, 11.0, 5.0);
		System.out.print("Each salad has " + Food.SalFat() + "g of fat, ");  
		System.out.print(Food.SalCarb() + "g of carbs, and " + Food.SalFibre() + " of fiber \n");
		System.out.println("");
		
		System.out.print("Enter the number of french fries - ");
		double numFre = Input.nextDouble();
		Food.Fries(numFre, 11.0, 36.0, 5.0);
		System.out.print("Each pack of french fries has " + Food.FriFat() + "g of fat, ");  
		System.out.print(Food.FriCarb() + "g of carbs, and " + Food.FriFibre() + " of fiber \n");
		System.out.println("");
		
		System.out.print("Enter the number of sodas - ");
		double numSod = Input.nextDouble();
		Food.Soda(numSod, 0.0, 38.0, 0.0);
		System.out.print("Each soda has " + Food.SodFat() + "g of fat, ");  
		System.out.print(Food.SodCarb() + "g of carbs, and " + Food.SodFibre() + " of fiber \n");
		System.out.println("");
		
		// Lastly it just prints out the total for the user's order
		System.out.println("Your order comes to $" + Food.Total());
		
		
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

-

Welcome to Lunch Order
Enter the number of hamburgers - 3
Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0 of fiber 

Enter the number of salads - 2
Each salad has 1.0g of fat, 11.0g of carbs, and 5.0 of fiber 

Enter the number of french fries - 4
Each pack of french fries has 11.0g of fat, 36.0g of carbs, and 5.0 of fiber 

Enter the number of sodas - 1
Each soda has 0.0g of fat, 38.0g of carbs, and 0.0 of fiber 

Your order comes to 15.7

-

Welcome to Lunch Order
Enter the number of hamburgers - 0
Each hamburger has 9.0g of fat, 33.0g of carbs, and 1.0 of fiber 

Enter the number of salads - 1
Each salad has 1.0g of fat, 11.0g of carbs, and 5.0 of fiber 

Enter the number of french fries - 2
Each pack of french fries has 11.0g of fat, 36.0g of carbs, and 5.0 of fiber 

Enter the number of sodas - 1
Each soda has 0.0g of fat, 38.0g of carbs, and 0.0 of fiber 

Your order comes to $5.55


*/