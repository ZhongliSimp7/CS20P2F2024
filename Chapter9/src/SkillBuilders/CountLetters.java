package SkillBuilders;
import java.util.*;

public class CountLetters {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		final int LOW = 'A'; //smallest possible value
		final int HIGH = 'Z'; //highest possible value
		int[] letterCounts = new int[HIGH - LOW + 1];
		String word;
		char[] wordLetters;
		int offset; //array index
		/* prompt user for a word */
		System.out.print("Enter a word: ");
		word = Input.nextLine().replaceAll(" ", "");
		
		 /* convert word to char array and count letter occurrences */
		word = word.toUpperCase();
		wordLetters = word.toCharArray();
		for (int letter = 0; letter < wordLetters.length; letter++) {
			offset = wordLetters[letter] - LOW;
			letterCounts[offset] += 1;
		}
		
		 /* show letter occurrences */
		for (int i = LOW; i <= HIGH; i++) {
			System.out.println((char)i + ": " + letterCounts[i - LOW]);
		 }
	 }
	

}

