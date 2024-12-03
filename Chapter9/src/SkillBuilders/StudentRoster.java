package SkillBuilders;
import java.util.*;

public class StudentRoster {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		String[] students;
		System.out.print("Enter the number of students in the class - ");
		int number = Input.nextInt();
		students = new String[number];
		
		for (int i = 0; i < number; i ++) {
			System.out.print("Enter the student name - ");
			String friend = Input.next();
			students[i] = friend;
		}
		
		System.out.println("");
		System.out.println("System Roster -");
		for (int i = 0; i < number; i ++) {
			System.out.println(students[i]);
			
		}

	}
}
