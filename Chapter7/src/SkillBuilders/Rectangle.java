package SkillBuilders;

public class Rectangle {
	
	private double length;
	private double breadth;
	
	 /*
	 * Changes the length of the rectangle.
	 * pre: none
	 * post: Length has been changed.
	 */
	 public void setLength(double newLength) {
	 length = newLength; }
	 
	 /*
	 * Changes the breadth of the rectangle.
	 * pre: none
	 * post: Breadth has been changed.
	 */
	 public void setBreadth(double newBreadth) {
	 breadth = newBreadth; }
	 
	 /*
	 * Calculates the area of the rectangle.
	 * pre: none
	 * post: The area of the rectangle has been returned.
	 */
	 public double area() {
	 double area;
	 area = length * breadth;
	 return(area); }
	 
	 /*
	 * Calculates the perimeter of the rectangle.
	 * pre: none
	 * post: The perimeter of the rectangle has been returned.
	 */
	 public double perimeter() {
	 double perimeter;
	 perimeter = 2*length + 2*breadth;
	 return(perimeter); }
	 
	 
	 /*
	 * Returns the length of the rectangle.
	 * pre: none
	 * post: The length of the rectangle has been returned.
	 */
	 public double getLength() {
	 return(length); }
	 
	 /*
	 * Returns the breadth of the rectangle.
	 * pre: none
	 * post: The breadth of the rectangle has been returned.
	 */
	 public double getBreadth() {
	 return(breadth); }
	 
	  /**
	  * Displays the formula for the area of a rectangle.
	  * pre: none
	  * post: The formula for area of a rectangle has been displayed.*/
	 public void DisplayAreaFormula() {
		 System.out.println("The area formula is A = l*b ");
	 }
	 
	 /**
	   * Checks to see if two rectangles are equal based on their length and breadth 
	   * pre: none
	   * post: Returns true/false 
	   */
	 public boolean equals(Object r) {
		Rectangle testObj = (Rectangle)r;
		if(testObj.getLength() == length && testObj.getBreadth() == breadth){
			return true;
		}
		else {
			return false;
		}
			
	}

}
