package SkillBuilders;

public class Circle {

	 private static final double PI = 3.14;
	 private double radius;
	 
	 /*
	 * constructor
	 * pre: none
	 * post: A Circle object created. Radius initialized to 1.
	 public Circle(int i) {
	 radius = 1; } //default radius
	 */
	 
	 /*
	 * Changes the radius of the circle.
	 * pre: none
	 * post: Radius has been changed.
	 */
	 public void setRadius(double newRadius) {
	 radius = newRadius; }
	 
	 /*
	 * Calculates the circumference of the circle.
	 * pre: none
	 * post: The circumference of the circle has been returned.
	 */
	 public double circumference() {
	 double circumference;
	 circumference = PI * radius * radius;
	 return(circumference); }

	 /**
	 * Calculates the area of the circle.
	 * pre: none
	 * post: The area of the circle has been returned.
	 */
	 public double area() {
	 double circleArea;
	 circleArea = PI * radius * radius;
	 return(circleArea); }
	 
	 /*
	 * Returns the radius of the circle.
	 * pre: none
	 * post: The radius of the circle has been returned.
	 */
	 public double getRadius() {
	 return(radius); }
	 
	 /**
	  * constructor
	  * pre: none
	  * post: A Circle object created with radius r.
	  */
	  public Circle(double r) {
	  radius = r; }
	  
	  /**
	  * Displays the formula for the area of a circle.
	  * pre: none
	  * post: The formula for area of a circle has been displayed.*/
	  public void DisplayAreaFormula() {
		  System.out.println("The area formula for the cirle is A = π*r*r");
	  }
}
	
