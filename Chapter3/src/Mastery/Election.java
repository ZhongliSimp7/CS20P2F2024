package Mastery;

import java.util.*;
import java.text.*;

public class Election {

	public static void main(String[] args) {
		
		// Declaration, preparing for and taking in user input
		Scanner Votes = new Scanner(System.in);
		System.out.println("Enter the number of votes for candidate Awbrey in the cities- ");
		System.out.print("New York- ");
		int awbNY = Votes.nextInt();
		System.out.print("New Jersey- ");
		int awbNJ = Votes.nextInt();
		System.out.print("Connecticut- ");
		int awbCC = Votes.nextInt();
		System.out.println("");
		
		// More user input for second candidate  
		System.out.println("Enter the number of votes for candidate Martinez in the cities- ");
		System.out.print("New York- ");
		int marNY = Votes.nextInt();
		System.out.print("New Jersey- ");
		int marNJ = Votes.nextInt();
		System.out.print("Connecticut- ");
		int marCC = Votes.nextInt();
		
		// Declaration of some new values, which are used for calculating total and percentage
		int awbTotal = awbNY + awbNJ + awbCC;
		int marTotal = marNY + marNJ + marCC;
		double awbPerc = (double)100*awbTotal/(awbTotal+marTotal);
		double marPerc = (double)100*marTotal/(awbTotal+marTotal);
		
		// Added DecimalFormat class again to make the percentage shorter in decimal places
		DecimalFormat voteShorten = new DecimalFormat("#.00");
		
		// Displays output
		System.out.println("");
		System.out.println("Candidate        Votes      Percentage");
		System.out.println(" Awbrey          " + awbTotal + "       " + voteShorten.format(awbPerc));
		System.out.println(" Martinez        " + marTotal + "       " + voteShorten.format(marPerc));
		System.out.println("");
		System.out.println("Total Votes- " + (awbTotal+marTotal));
		
	}
}

/* Screen Dump 

Enter the number of votes for candidate Awbrey in the cities- 
New York- 10000
New Jersey- 10000
Connecticut- 10000

Enter the number of votes for candidate Martinez in the cities- 
New York- 15000
New Jersey- 5000
Connecticut- 8000

Candidate        Votes      Percentage
 Awbrey          30000       51.72
 Martinez        28000       48.28
 
Total Votes- 58000

*/
