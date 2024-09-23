package SkillBuilders;

import java.util.*;

public class PerfectSquare {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter an integer- ");
		int number = Input.nextInt();
		
		int root = (int) Math.sqrt(number);
		int number1 = (int) Math.pow(root, 2);
		if (number == number1) {
			System.out.println("Your number is a perfect square");
		}
		else {
			System.out.println("Your number is not a perfect square");
		}
		
	}
}
