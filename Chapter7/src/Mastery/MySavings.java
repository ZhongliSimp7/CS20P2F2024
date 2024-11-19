package Mastery;

public class MySavings {

	private double savings;
	
	/*
	 * Adds or withdraws money to/from the bank.
	 * pre: none
	 * post: Savings have been changed.
	 */
	 public void AddCoins(double input) {
	 savings += input; }
	 
	
	/*
	 * Returns the total money in the bank.
	 * pre: none
	 * post: The total money in the bank has been returned.
	 */
	 public double total() {
	 double total = savings;
	 return(total); }
	
}
