package SkillBuilders;

import java.util.*;

public class SpanishNumbers {

	public static String spanishNumbers(int num) {
		
		switch (num) {
			case 1: return("uno");
			case 2: return("dos");
			case 3: return("tres");
			case 4: return("cuatro");
			case 5: return("cinco");
			case 6: return("seis");
			case 7: return("siete");
			case 8: return("ocho");
			case 9: return("nueve");
			case 10: return("diez");
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter a number between 1 to 10 - ");
		int num = Input.nextInt();
		
		String spaNum = spanishNumbers(num);
		
		System.out.println("The Spanish number for " + num + " is " + spaNum);
	}
}
