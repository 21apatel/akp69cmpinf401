package akp69_Assignment1;
import javax.swing.JOptionPane;


public class DecMon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value = JOptionPane.showInputDialog("Enter an amount of money from 1 dolllar to 9999 dollars(integer)");
		int ivalue = Integer.parseInt(value);
		
		int grands = ivalue/1000;
		ivalue = ivalue%1000;
		
		int benjamins = ivalue/100;
		ivalue = ivalue%100;
		
		int sawbucks = ivalue/10;
		ivalue = ivalue % 10;
		
		int bucks = ivalue;
		
		JOptionPane.showMessageDialog(null, grands + " grands \n" + benjamins + " Benjamins  \n" + sawbucks + " sawbucks \n" + bucks + " bucks");



	}

}
