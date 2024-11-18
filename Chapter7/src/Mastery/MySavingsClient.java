package Mastery;
import java.util.*;

public class MySavingsClient {

	public static void main(String[] args) {
		
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
		
		do {
			System.out.print("Enter your choice - ");
			choice = Input.nextInt();
			
			switch(choice) {
				case 0: break;
				case 1: System.out.println("The total money in the bank is " + PiggyBank.total());
				case 2: PiggyBank.AddCoins(0.01);
				case 3: PiggyBank.AddCoins(0.05);
				case 4: PiggyBank.AddCoins(0.1);
				case 5: PiggyBank.AddCoins(0.25);
				case 6: 
			}
			
		} while(choice != 0);
	}
}
