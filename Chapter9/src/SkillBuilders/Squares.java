package SkillBuilders;

public class Squares {

	public static void main(String[] args) {
			
		int[] numbers = new int[5];
		for (int i = 0; i < 5; i ++) {
			numbers[i] = (i*i);
		}
		
		for (int i = 0; i < 5; i ++) {
			System.out.println(numbers[i]);
		}
			
	}
}
