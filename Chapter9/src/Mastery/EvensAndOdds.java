package Mastery;
import java.io.*;
import java.util.*;

public class EvensAndOdds {

	public static void main(String[] args) {
		
		Random number = new Random();
		int max = 99, min = 0;
		int[] numbers = new int[25];
		 
		for (int i = 0; i < 25; i++) {
			int x = number.nextInt(max - min + 1) + min;
			numbers[i] = x;
		}

	}
}
