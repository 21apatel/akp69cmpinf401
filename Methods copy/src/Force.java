public class Force {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		// F = Mass * Acceleration
		// Function Force(m,a)
		
		double result = force(10, 9.8);
		System.out.println(result);
	
	}
	
	public static double force(double mass, double acc) {
		
		double forceCalc = mass * acc;
		
		return forceCalc; // Return statement is the very last thing you do with the function
	}

}
