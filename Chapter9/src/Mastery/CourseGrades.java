/*

Program: CourseGrades.java          Date: December 10th, 2024


Purpose: Creates a array with student grades with various functions to make use of  


School: CHHS
Course: Computer Science 20
 
*/


package Mastery;
import java.util.*;

public class CourseGrades {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		int [][] GradeBook = new int[5][12];
		GradeBook book = new GradeBook();
		
		// Get grades
		for (int i = 0; i < GradeBook.length; i++) {
            for (int j = 0; j < GradeBook[0].length ; j++) {
            	System.out.print("Enter student " + (j+1) + " grades for course " + (i+1) + " - ");
            	int x = Input.nextInt();
            	GradeBook[i][j] = x;
            }
          System.out.println("");
        }
		
		book.showGrades();
		
		System.out.print("Enter student number to see average - ");
		
		System.out.print("Enter test number to see average - ");
		
	}
}

/* 
 
Screen Dump (2 Test Cases) - 



*/
