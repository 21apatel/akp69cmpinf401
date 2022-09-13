
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double balance = 1000;
		
		balance = withdrawal(balance, 10);
		System.out.println(balance);
		
		balance = withdrawal(balance, 10, "CAD");
		System.out.println(balance);
		
		balance = deposit(balance, 10);
		System.out.println(balance);

	}
	
	public static double withdrawal(double initBalance, double amount) {
		double finalBalance = initBalance - amount;
		
		return finalBalance;
	}
	
	public static double withdrawal(double initBalance, double amount, String currency) {
		double finalBalance = initBalance;
		if(currency.equalsIgnoreCase("CAD")) {
			amount = amount * 0.77;
			
		}
		
		finalBalance = initBalance - amount;
		
		return finalBalance;
	}
	
	public static double deposit(double initBalance, double amount) {
		
		double finalBalance = initBalance + amount;
		
		return finalBalance;
			
	}

}
