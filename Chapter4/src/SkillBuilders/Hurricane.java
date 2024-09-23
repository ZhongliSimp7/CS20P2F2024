package SkillBuilders;

import java.util.*;

public class Hurricane {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		System.out.println("Enter the Hurricane Category- ");
		int categoryNum = Input.nextInt();
		
		switch (categoryNum) {
			case 1: System.out.print("Wind speeds of 74-95 mph or 64-82 kt or 119-153 kmh "); break;
			case 2: System.out.print("Wind speeds of 96-110 mph or 83-95 kt or 154-177 kmh "); break;
			case 3: System.out.print("Wind speeds of 111-130 mph or 96-113 kt or 178-209 kmh "); break;
			case 4: System.out.print("Wind speeds of 131-155 mph or 114-135 kt or 210-249 kmh "); break;
			case 5: System.out.print("Wind speeds of greater than 155 mph or 135 kt or 249 kmh "); break;
		}

	}
}
