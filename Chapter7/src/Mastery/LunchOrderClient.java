package Mastery;
import java.util.*;

public class LunchOrderClient {

	public static void main(String[] args) {
		
		LunchOrder MyOrder = new LunchOrder(); 
		Scanner Input = new Scanner(System.in);
		System.out.println("Welcome to Lunch Order");
		
		System.out.print("Enter the number of hamburgers - ");
		int numHam = Input.nextInt();
		MyOrder.Ham(numHam);
		
		System.out.print("Enter the number of salads - ");
		int numSal = Input.nextInt();
		MyOrder.Salad(numSal);
		
		System.out.print("Enter the number of french fries - ");
		int numFre = Input.nextInt();
		MyOrder.Fries(numFre);
		
		System.out.print("Enter the number of sodas - ");
		int numSod = Input.nextInt();
		MyOrder.Soda(numSod);
		
		
		// No loop needed here
	}
}
