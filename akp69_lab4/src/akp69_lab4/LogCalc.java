package akp69_lab4;
import javax.swing.JOptionPane;


public class LogCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int exponent = 0;
		int base = 0; 
		
		while(exponent <= 0) {
			String strExponent = JOptionPane.showInputDialog("Enter an exponent value that is greater than zero");
			exponent = Integer.parseInt(strExponent);
		
			if(exponent <=0) {
			JOptionPane.showMessageDialog(null, "Error, exponent value must be greater than zero ");
			}
		}
		
		while(base <= 1) {
			String strBase = JOptionPane.showInputDialog("Enter a base value that is greater than one");
			base = Integer.parseInt(strBase);
		
			if(base <=1) {
			JOptionPane.showMessageDialog(null, "Error, base value must be greater than one ");
			}
		}
		
		int log = 0;
		while(exponent >= base) {
			exponent = exponent/base;
			log+=1;
		}
		
		JOptionPane.showMessageDialog(null, "The answer is " + log);
		
		
		
		

	}

}
