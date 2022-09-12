package akp69_Assignment1;
import javax.swing.JOptionPane;


public class AreaPer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String radius = JOptionPane.showInputDialog("Enter in your radius");
		double r = Double.parseDouble(radius);
	
		double perimeter = (2 * Math.PI * r);
		double area = (Math.PI * r * r);
	
		JOptionPane.showMessageDialog(null, "The circle with radius " + radius + " has an area of " + area + " and a perimeter of " + perimeter);


	}

}
