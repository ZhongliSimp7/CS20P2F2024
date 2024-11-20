package Mastery;

public class DigitExtractor {

	private int number;
	
	/*
	 * Sets value of the number as the input.
	 * pre: none
	 * post: Value of number has been set.
	 */
	 public void setNumber(int i) {
	 number = i; }
	 
	 /*
	 * Returns the number.
	 * pre: none
	 * post: The number has been returned.
	 */ /*
	 public int showNumber() {
	 return(number); }
	
	/*
	 * Returns the digit at hundreds place.
	 * pre: none
	 * post: The hundreds place digit has been returned.
	 */
	 public int hundreds() {
	 int hundreds = number/100;
	 return(hundreds); }
	 
	 /*
	 * Returns the digit at tens place.
	 * pre: none
	 * post: The tens place digit has been returned.
	 */
	 public int tens() {
	 int temp1 = number%100;
	 int tens = temp1/10;
	 return(tens); }
	 
	 /*
	 * Returns the digit at ones place.
	 * pre: none
	 * post: The ones place digit has been returned.
	 */
	 public int ones() {
	 int temp1 = number%100;
	 int ones = temp1%10;
	 return(ones); }
 
}
