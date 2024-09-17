package Mastery;

import java.util.*;

public class Digits {
	
    public static void main(String[] args) {

        //Declare variables for hundredsPlace, tensPlace, onesPlace
        int x;
        int y;
        int z;

        //Declare variable for number
        int number;

        //Introduce Scanner class
		Scanner Number = new Scanner(System.in);

        //Prompt the user to enter a three digit number
        System.out.println("Enter a three digit number- ");

        //store number
        number = Number.nextInt();

        //Calculate the hundredsPlace
        x = number/100;

        //Calculate the tensPlace
        y = (number%100)/10;

        //Calculate the onesPlace
        z = (number%100)%10;

        //Output the hundredsPlace
        System.out.println("The hundreds place digit is " + x);

        //Output the tensPlace
        System.out.println("The tens place digit is " + y);

        //Output the onesPlace
        System.out.println("The ones place digit is " + z);

    }

}