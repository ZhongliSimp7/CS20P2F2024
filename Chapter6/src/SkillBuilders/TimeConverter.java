package SkillBuilders;

import java.util.*;

public class TimeConverter {

	public static void hoursToMins() {
		
		Scanner Input = new Scanner(System.in);
		int hours, mins;
		System.out.print("Enter the number of hours - ");
		hours = Input.nextInt();
		
		mins = hours * 60;
		System.out.println("There are " + mins + " minutes in " + hours + " hours");
		
	}
	
	public static void daysToHours() {
			
		Scanner Input = new Scanner(System.in);
		int days, hours;
		System.out.print("Enter the number of days - ");
		days = Input.nextInt();
			
		hours = days * 24;
		System.out.println("There are " + hours + " hours in " + days + " days");
			
	}
	
	public static void minsToHours() {
		
		Scanner Input = new Scanner(System.in);
		int hours, mins;
		System.out.print("Enter the number of minutes - ");
		mins = Input.nextInt();
		
		hours = mins / 60;
		System.out.println("There are " + hours + " hours in " + mins + " minutes");
		
	}
	
	public static void hoursToDays() {
		
		Scanner Input = new Scanner(System.in);
		int days, hours;
		System.out.print("Enter the number of hours - ");
		hours = Input.nextInt();
			
		days = hours / 24;
		System.out.println("There are " + days + " days in " + hours + " hours");
			
	}
	
	public static void main(String[] args) {
		
		int option;
		Scanner Input = new Scanner(System.in);
		System.out.println("Choose one of the following options (integers) - ");
		System.out.println("");
		System.out.println("1 - Hours to Minutes ");
		System.out.println("2 - Days to Hours ");
		System.out.println("3 - Minutes to Hours ");
		System.out.println("4 - Hours to Days ");
		
		option = Input.nextInt();
		switch (option) {
			
			case 1: hoursToMins();
			case 2: daysToHours();
			case 3: minsToHours();
			case 4: hoursToDays();
		
		}
		
	}
}
