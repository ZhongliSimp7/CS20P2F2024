package SkillBuilders;

import java.util.*;

public class NumberSum {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter a number - ");
		int userInput = Input.nextInt();
		
		int num = 1;
		int totalSum = 0;
		while (userInput != num) {
			System.out.println(num);
			num += 1;
			totalSum += num;
		}
		
		System.out.println("The sum of the numbers is " + totalSum);
	}
}
