package Mastery;

public class LunchOrder {
	
	private int numHam;
	private int numSal;
	private int numFre;
	private int numSod;
	
	private double ham = 1.85;
	private double salad = 2.00;
	private double fries = 1.30;
	private double soda = 0.95;

	 /*
	 * Sets number of the Ham as the input.
	 * pre: none
	 * post: Number of ham has been set.
	 */
	 public void Ham(int i) {
	 numHam = i; }
	 
	 
	 /*
	 * Sets number of the Salad as the input.
	 * pre: none
	 * post: Number of salad has been set.
	 */
	 public void Salad(int i) {
	 numSal = i; }
		 
	 /*
	 * Sets number of the fries as the input.
	 * pre: none
	 * post: Number of fries has been set.
	 */
	 public void Fries(int i) {
	 numFre = i; }
			 
	 /*
	 * Sets number of the soda as the input.
	 * pre: none
	 * post: Number of soda has been set.
	 */
	 public void Soda(int i) {
	 numSod = i; }
	 
	 /*
	 * Calculates and returns total cost of order.
	 * pre: none
	 * post: Total has been returned.
	 */
	 public double Total() {
		 double total = numHam*ham + numSal*salad + numFre*fries + numSod*soda;
		 return(total);
	 }
 
}
