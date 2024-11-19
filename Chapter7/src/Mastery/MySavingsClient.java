/*

Program: MySavings.java          Date: November 19th, 2024


Purpose: Gives the user choices to make changes to their savings and view it 


School: CHHS
Course: Computer Science 20
 
*/


package Mastery;
import java.util.*;

public class MySavingsClient {

	public static void main(String[] args) {
		
		// Declaration and various statements showing the user the possible choices
		int choice;
		MySavings PiggyBank = new MySavings();
		Scanner Input = new Scanner(System.in);
		System.out.println("1. Show total in bank");
		System.out.println("2. Add a penny");
		System.out.println("3. Add a nickel");
		System.out.println("4. Add a dime");
		System.out.println("5. Add a quarter");
		System.out.println("6. Take money out of the bank");
		System.out.println("Enter 0 to quit");
		System.out.println("");
		
		// Executes at least once, and more if the user does not quit 
		do {
			System.out.print("Enter your choice - ");
			choice = Input.nextInt();
			
			// Depending on the choice the user makes, different code is run 
			// AddCoins() function either adds or withdraws money from bank
			switch(choice) {
				case 0: break;
				case 1: System.out.println("The total money in the bank is " + PiggyBank.total()); break;
				case 2: PiggyBank.AddCoins(0.01); break;
				case 3: PiggyBank.AddCoins(0.05); break;
				case 4: PiggyBank.AddCoins(0.1); break;
				case 5: PiggyBank.AddCoins(0.25); break;
				case 6: System.out.print("Enter the amount you would like to withdraw ");
						double withAmount = Input.nextDouble();
						PiggyBank.AddCoins(-(withAmount)); break;
			}
			
		} while(choice != 0);
	}
}

/* 
 
Screen Dump (2 Test Cases) - 
 
-

1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
Enter 0 to quit

Enter your choice - 2
Enter your choice - 5
Enter your choice - 4
Enter your choice - 1
The total money in the bank is 0.36
Enter your choice - 0

-

1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of the bank
Enter 0 to quit

Enter your choice - 3
Enter your choice - 4
Enter your choice - 4
Enter your choice - 5
Enter your choice - 6
Enter the amount you would like to withdraw 0.2
Enter your choice - 1
The total money in the bank is 0.3
Enter your choice - 0


*/