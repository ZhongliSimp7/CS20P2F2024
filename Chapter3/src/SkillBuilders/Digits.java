package SkillBuilders;

import java.util.*;

public class Digits {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		System.out.print("Enter a two digit number - ");
		int number = Input.nextInt();
		
		int tensPlace = (number/10);
		int onesPlace = (number%10);
		
		System.out.println("The tens place digit is " + tensPlace);
		System.out.println("The ones place digit is " + onesPlace);
		
	}

}
