package SkillBuilders;

import java.util.*;

public class Delivery {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter the length of your package- ");
		double length = Input.nextDouble();
		System.out.print("Enter the width of your package- ");
		double width = Input.nextDouble();
		System.out.print("Enter the height of your package- ");
		double height = Input.nextDouble();
		
		if (length <= 10 && width <=10 && height <= 10) {
			System.out.println("Your package is accepted");
		}
		else {
			System.out.println("Your package is rejected");
		}
		
	}
}
