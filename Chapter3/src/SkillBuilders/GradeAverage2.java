package SkillBuilders;

import java.util.*;
import java.text.*;

public class GradeAverage2 {

	public static void main(String[] args) {
		
		Scanner Numbers = new Scanner(System.in);
		
		//Declaration and Initialization
		double GradeTotal = 0.0;
		System.out.print("Enter the first grade- ");
		GradeTotal += Numbers.nextInt();
		System.out.print("Enter the second grade- ");
		GradeTotal += Numbers.nextInt(); 
		System.out.print("Enter the third grade- ");
		GradeTotal += Numbers.nextInt();
		System.out.print("Enter the fourth grade- ");
		GradeTotal += Numbers.nextInt(); 
		System.out.print("Enter the fifth grade- ");
		GradeTotal += Numbers.nextInt();
		
		double GradeAverage = (double)GradeTotal/5.0;
		System.out.println(GradeAverage);
		NumberFormat percent = NumberFormat.getPercentInstance();
		var GradeAveragePercent = percent.format(GradeAverage/100);
		
		System.out.print("Your average percentage is " + GradeAveragePercent);
		
	}
}
