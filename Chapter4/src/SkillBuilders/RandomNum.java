package SkillBuilders;

import java.util.*;

public class RandomNum {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter the minimum value number- ");
		int minVal = Input.nextInt();
		System.out.print("Enter the maximum value number- ");
		int maxVal = Input.nextInt();
		
		Random random = new Random();
		int x = random.nextInt(maxVal) + minVal;
		System.out.println("Random number is " + x);

	}
}
