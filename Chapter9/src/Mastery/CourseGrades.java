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
		// Create an object book with 5 rows and 12 columns (tests/students)
		GradeBook book = new GradeBook(5, 12);
		
		// Input the grades
		book.getGrades();
		// Shows the grade array
		book.showGrades();
		
		System.out.println("");
		
		// Shows average grades of a student
		System.out.print("Enter student number to see average - ");
		int student = Input.nextInt();
		book.studentAvg(student);
		
		System.out.println(" ");
		
		// Shows average grades for a test
		System.out.print("Enter test number to see average - ");
		int test = Input.nextInt();
		book.testAvg(test);
		
	}
}

/* 
 
Screen Dump (2 Test Cases) - 


Enter student 1 grades for test 1 - 20
Enter student 2 grades for test 1 - 30

Enter student 1 grades for test 2 - 30
Enter student 2 grades for test 2 - 40

Enter student 1 grades for test 3 - 40
Enter student 2 grades for test 3 - 50

20 30 
30 40 
40 50 

Enter student number to see average - 1
Student 1 average is 30.0 
Enter test number to see average - 2
Test 2 average is 35.0

---------------------------------------

Enter student 1 grades for test 1 - 20
Enter student 2 grades for test 1 - 30
Enter student 3 grades for test 1 - 40

Enter student 1 grades for test 2 - 40
Enter student 2 grades for test 2 - 50
Enter student 3 grades for test 2 - 60

20 30 40 
40 50 60 

Enter student number to see average - 1
Student 1 average is 30.0 
Enter test number to see average - 2
Test 2 average is 50.0

*/
