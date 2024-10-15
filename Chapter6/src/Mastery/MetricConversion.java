/*

Program: MetricConversion.java          Date: October 8th, 2024


Purpose: Converts from Metric to Imperial units and vice versa, based on user's choice


School: CHHS
Course: Computer Science 20
 
*/

package Mastery;

import java.util.*;

public class MetricConversion {

	public static void inchToCm() {
		
		// Declaration and initiation
		Scanner Input = new Scanner(System.in);
		System.out.print("Input the number of inches - ");
		int inch = Input.nextInt();
		double cm = inch * 2.54;
		System.out.println(inch + " inches equals " + cm + " centimetres");
		
	}
	
	public static void feetToCm() {
		
		// Declaration and initiation
		Scanner Input = new Scanner(System.in);
		System.out.print("Input the number of feet - ");
		int feet = Input.nextInt();
		double cm = feet * 30;
		System.out.println(feet + " feet equals " + cm + " centimetres");
		
	}
	
	public static void yardToM() {
		
		// Declaration and initiation 
		Scanner Input = new Scanner(System.in);
		System.out.print("Input the number of yards - ");
		int yards = Input.nextInt();
		double m = yards * 0.91;
		System.out.println(yards + " yards equals " + m + " metres");
		
	}
	
	public static void mileToKm() {
		
		// Declaration and initiation 
		Scanner Input = new Scanner(System.in);
		System.out.print("Input the number of miles - ");
		int miles = Input.nextInt();
		double km = miles * 1.6;
		System.out.println(miles + " miles equals " + km + " kilometres");
		
	}
	
	public static void cmToInch() {
		
		// Declaration and initiation 
		Scanner Input = new Scanner(System.in);
		System.out.print("Input the number of centimetres - ");
		int cm = Input.nextInt();
		double inch = cm / 2.54;
		System.out.println(cm + " centimetres equals " + inch + "inches");
		
	}
	
	public static void cmToFeet() {
		
		// Declaration and initiation 
		Scanner Input = new Scanner(System.in);
		System.out.print("Input the number of centimetres - ");
		int cm = Input.nextInt();
		double feet = cm / 30;
		System.out.println(cm + " centimetres equals " + feet + " feet");
		
	}
	
	public static void mToYard() {
		
		// Declaration and initiation 
		Scanner Input = new Scanner(System.in);
		System.out.print("Input the number of metres - ");
		int m = Input.nextInt();
		double yard = m / 0.91;
		System.out.println(m + " metres equals " + yard + " yards");
		
	}
	
	public static void kmToMile() {
		
		// Declaration and initiation 
		Scanner Input = new Scanner(System.in);
		System.out.print("Input the number of kilometres - ");
		int km = Input.nextInt();
		double miles = km / 1.6;
		System.out.println(km + " kilometres equals " + miles + " miles");
		
	}
	
	public static void main(String[] args) {
		
		// Declaration and initiation, preparing for user input 
		Scanner Input = new Scanner(System.in);
		int userChoice;
		
		System.out.println("Choose from one of the below conversions - ");
		System.out.println("");
		System.out.println("1 - Inches to centimetres     5 - Centimetres to Inches ");
		System.out.println("2 - Feet to centimetres       6 - Centimetres to Feet ");
		System.out.println("3 - Yards to metres           7 - Metres to yards ");
		System.out.println("4 - Miles to kilometres       8 - Kilometres to miles ");
		System.out.println("");
		System.out.print("Enter your choice - ");
		userChoice = Input.nextInt();
		System.out.println("");
		
		// Creating a switch statement to execute the associated function 
		switch (userChoice) {
		
			case 1: inchToCm(); break;
			case 2: feetToCm(); break;
			case 3: yardToM(); break;
			case 4: mileToKm(); break;
			case 5: cmToInch(); break;
			case 6: cmToFeet(); break;
			case 7: mToYard(); break;
			case 8: kmToMile(); break;
				
		}
		
	}
}

/*
  
Screen Dump (2 Test Cases) - 

 
Choose from one of the below conversions - 

1 - Inches to centimetres     5 - Centimetres to Inches 
2 - Feet to centimetres       6 - Centimetres to Feet 
3 - Yards to metres           7 - Metres to yards 
4 - Miles to kilometres       8 - Kilometres to miles 

Enter your choice - 4
Input the number of miles - 200
200 miles equals 320.0 kilometres

 
Choose from one of the below conversions - 

1 - Inches to centimetres     5 - Centimetres to Inches 
2 - Feet to centimetres       6 - Centimetres to Feet 
3 - Yards to metres           7 - Metres to yards 
4 - Miles to kilometres       8 - Kilometres to miles 

Enter your choice - 1

Input the number of inches - 140
140 inches equals 355.6 centimetres


*/
