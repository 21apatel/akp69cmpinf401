package akp69_Assignment1;
import javax.swing.JOptionPane;


public class PythTheorem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String side1 = JOptionPane.showInputDialog("Enter in your first side");
		String side2 = JOptionPane.showInputDialog("Enter in your second side");
		
		double s1 = Double.parseDouble(side1);
		double s2 = Double.parseDouble(side2);
		
		double hypotenuse = Math.sqrt((Math.pow(s1, 2) + Math.pow(s2, 2)));
		hypotenuse = hypotenuse * 100;
		double s3 = (double)Math.round(hypotenuse);
		s3 = s3/100;
		
		JOptionPane.showMessageDialog(null, "The hypotenuse is " + s3);


	}

}
