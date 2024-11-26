package SkillBuilders;

public class Circle1 {
	
	public static void main(String[] args) {
		
		/* Circle 1 Skill Builder
		 * 
		Circle Circle1 = new Circle();
		Circle1.setRadius(3);
		System.out.println("The radius of the circle is " + Circle1.getRadius());
		System.out.println("The circumference of the circle is " + Circle1.circumference());
		*/
		
		/* Circle 2 Skill Builder */
		Circle Circle1 = new Circle(5);
		Circle Circle2 = new Circle(4);
		// System.out.println("The radius of the circle is " + Circle1.getRadius()); 
		// Circle1.DisplayAreaFormula();
		
		if (Circle1.equals(Circle2)) {
			 System.out.println("The circles are similar.");
		} 
		else {
			 System.out.println("The circles are not similar.");
		}
		
	}
}