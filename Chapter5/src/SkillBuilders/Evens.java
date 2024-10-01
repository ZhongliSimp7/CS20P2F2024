package SkillBuilders;

public class Evens {

	public static void main(String[] args) {
		
		int num = 1;
		while (num < 21) {	
			num += 1;
			if ((num % 2) == 0) {
				System.out.println(num); }
		}
	}
}
