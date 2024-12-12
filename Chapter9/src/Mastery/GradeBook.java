package Mastery;
import java.util.*;

public class GradeBook {

	private int[][] GradeBook;
	
	// GradeBook method with students and grades
	public GradeBook(int grades, int students) {
		GradeBook = new int[grades][students];
	}
	
	Scanner Input = new Scanner(System.in);
	
	// Method to get the grades from the user
	public void getGrades() {
		for (int i = 0; i < GradeBook.length; i++) {
		    for (int j = 0; j < GradeBook[0].length ; j++) {
		    	System.out.print("Enter student " + (j+1) + " grades for test " + (i+1) + " - ");
		    	int x = Input.nextInt();
		    	GradeBook[i][j] = x;
		    }
		  System.out.println("");
		}
	}
	
	// Goes through each element in the array and displays them in a table form
	public void showGrades() {
		for (int i = 0; i < GradeBook.length; i++) {
	        for (int j = 0; j < GradeBook[0].length ; j++) {
	        	System.out.print(GradeBook[i][j] + " ");
	        }
	      System.out.println("");
	    }
	}
	
	
	public void studentAvg(int num) {
		// Student Average 
		double avg = 0;
		double sum = 0;
		for (int i = 0; i < GradeBook.length; i++) {
			sum += GradeBook[i][num-1];
		}
	  System.out.print("Student " + (num) + " average is ");
	  // Average is the sum divided by number of tests
	  avg = sum/GradeBook.length;
	  System.out.print(avg);
	}
	
	public void testAvg(int num) {
		// Test Average 
		double avg = 0;
		double sum = 0;
		for (int i = 0; i < GradeBook[0].length; i++) {
			sum += GradeBook[num-1][i];
		}
	  System.out.print("Test " + (num) + " average is ");
	  // Average is the sum divided by number of students
	  avg = sum/GradeBook[0].length;
	  System.out.print(avg);
	}
	
}
