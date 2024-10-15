package SkillBuilders;

import java.util.*;

public class Exponentiation {
	
	public static void powerOf() {

		Scanner Input = new Scanner (System.in);
		System.out.print("Input the base number - ");
		int base = Input.nextInt();
		System.out.print("Input the power number - "); 
		int power = Input.nextInt();
		
		double ans = Math.pow(base, power);
		int answer = (int) ans;
		
		System.out.println(base + " to the power of " + power + " is " + answer);
		
	}
	
	public static void main(String[] args) {
		
		powerOf();
		
	}
}
