package Mastery;

//Need a header

//Import section
import java.util.*;
import java.text.*;

public class Project {

	public static void main(String[] args) {
		
		//Declaration 
		
		int designing, coding, debugging, testing;
		double totalMinutes, totalDesign, totalCode, totalDebug, totalTest;
		
      //Prompt the user to get all the data for some of the above variables
		
		Scanner Number = new Scanner(System.in);
		System.out.println("Enter the minutes you spent on the following tasks- ");
		System.out.print("Designing the code- ");
		designing = Number.nextInt();
		System.out.print("Coding- ");
		coding = Number.nextInt();
		System.out.print("Debugging the code- ");
		debugging = Number.nextInt();
		System.out.print("Testing- ");
		testing = Number.nextInt();

      //Calculate the information for some of the above variables
		totalMinutes = designing + coding + debugging + testing;
		totalDesign = 100*designing/totalMinutes;
		totalCode = 100*coding/totalMinutes;
		totalDebug = 100*debugging/totalMinutes;
		totalTest = 100*testing/totalMinutes;
		
	  //Using the DecimalFormat class to limit decimal places in final output to 2
		DecimalFormat numberFormat = new DecimalFormat("#.00");

      //Output to the console all the required variables for this assignment
		System.out.println("");
		System.out.println("Task                 % Time");
		System.out.println("");
		System.out.println("Designing            " + numberFormat.format(totalDesign) + " %");
		System.out.println("Coding               " + numberFormat.format(totalCode) + " %");
		System.out.println("Debugging            " + numberFormat.format(totalDebug) + " %");
		System.out.println("Testing              " + numberFormat.format(totalTest) + " %");

  }
}

/* Screen Dump -
 
  
Enter the minutes you spent on the following tasks- 
Designing the code- 100
Coding- 300
Debugging the code- 150
Testing- 50

Task                 % Time

Designing            16.67 %
Coding               50.00 %
Debugging            25.00 %
Testing              8.33 %


*/

