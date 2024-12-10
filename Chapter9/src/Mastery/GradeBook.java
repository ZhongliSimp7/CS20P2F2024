package Mastery;

public class GradeBook {

	int [][] GradeBook;
	
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
		for (int i = 0; i < GradeBook.length; i++) {
			System.out.print("Student " + (i+1) + " average is ");
			//return(GradeBook[num][0]);
			
		}

	}
	
	public void testAvg(int num) {
		for (int i = 0; i < GradeBook[0].length; i++) {
			System.out.print("Test " + (i+1) + " average is ");
			//return();
		}
	}
	
}
