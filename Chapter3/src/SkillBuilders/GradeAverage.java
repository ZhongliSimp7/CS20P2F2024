package SkillBuilders;

import java.util.*;

public class GradeAverage {

	public static void main(String[] args) {
		
		Scanner Numbers = new Scanner(System.in);
		
		//Declaration and Initialization
		System.out.print("Enter the first grade- ");
		int Grade1 = Numbers.nextInt();
		System.out.print("Enter the second grade- ");
		int Grade2 = Numbers.nextInt();
		System.out.print("Enter the third grade- ");
		int Grade3 = Numbers.nextInt();
		System.out.print("Enter the fourth grade- ");
		int Grade4 = Numbers.nextInt();
		System.out.print("Enter the fifth grade- ");
		int Grade5 = Numbers.nextInt();
		
		double GradeTotal = ((Grade1) + Grade2 + Grade3 + Grade4 + Grade5);
		double GradeAverage = GradeTotal/5;
		System.out.print("Your grade average is " + GradeAverage);
		
	}

}
