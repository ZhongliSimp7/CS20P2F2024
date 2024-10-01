package SkillBuilders;

import java.util.*;

public class OddSum {

	public static void main(String[] args) {

		Scanner Input = new Scanner(System.in);
		System.out.print("Enter a number - ");
		int userInput = Input.nextInt();
		int totalSum = 0;
		
		for (int num = 0; num <= userInput; num++) {
			if ((num % 2) == 1) {
				totalSum += num; }
		}
		
		System.out.println(totalSum);
	}
}
