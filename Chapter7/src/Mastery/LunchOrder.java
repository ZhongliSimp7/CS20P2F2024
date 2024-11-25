package Mastery;

public class LunchOrder {
	
	private double numHam;
	private double numSal;
	private double numFre;
	private double numSod;

	private double Fat;
	private double Carbs;
	private double Fiber;
	
	private double ham = 1.85;
	private double salad = 2.00;
	private double fries = 1.30;
	private double soda = 0.95;
	
	// All the methods for ham
	 public void Ham(double i, double f, double c, double fi) {
	 numHam = i; 
	 Fat = f;
	 Carbs = c;
	 Fiber = fi; }
	 
	 public double HamFat() {
		 return Fat; }
	 public double HamCarb() {
		 return Carbs; }
	 public double HamFibre() {
		 return Fiber; }

	 // All the methods for salad
	 public void Salad(double i, double f, double c, double fi) {
	 numSal = i; 
	 Fat = f;
	 Carbs = c;
	 Fiber = fi; }
	 
	 public double SalFat() {
		 return Fat; }
	 public double SalCarb() {
		 return Carbs; }
	 public double SalFibre() {
		 return Fiber; }
	 
	 // All the methods for fries
	 public void Fries(double i, double f, double c, double fi) {
	 numFre = i; 
	 Fat = f;
	 Carbs = c;
	 Fiber = fi; }
	 
	 public double FriFat() {
		 return Fat; }
	 public double FriCarb() {
		 return Carbs; }
	 public double FriFibre() {
		 return Fiber; }
	 
	 // All the methods for soda
	 public void Soda(double i, double f, double c, double fi) {
	 numSod = i; 
	 Fat = f;
	 Carbs = c;
	 Fiber = fi; }
	 
	 public double SodFat() {
		 return Fat; }
	 public double SodCarb() {
		 return Carbs; }
	 public double SodFibre() {
		 return Fiber; }
	 
	 // Method for calculating and displaying the total
	 public double Total() {
		 double total = numHam*ham + numSal*salad + numFre*fries + numSod*soda;
		 return(total);
	 }
 
}
