package SkillBuilders;

public class Rectangle1 {
	
	public static void main(String[] args) {
		
		/* Rectangle 1 Skill Builder*/
		Rectangle Rectangle1 = new Rectangle();
		Rectangle1.setLength(10);
		Rectangle1.setBreadth(5);
		System.out.println("Perimeter is " + Rectangle1.perimeter());
		System.out.println("Area is " + Rectangle1.area());
		Rectangle1.DisplayAreaFormula();
	}
}

