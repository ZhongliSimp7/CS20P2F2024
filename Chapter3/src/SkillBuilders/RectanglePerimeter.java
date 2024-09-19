package SkillBuilders;

import java.util.*;

public class RectanglePerimeter {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		//Declaration and Initialization
		System.out.print("Please enter the length- ");
		int length = userInput.nextInt();
		System.out.print("Please enter the width- ");
		int width = userInput.nextInt();
		
		int perimeter = 2*(length) + 2*(width);
		System.out.print("The perimeter is " + perimeter);
	}

}