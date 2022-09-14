package akp69_lab3;
import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userInput= JOptionPane.showInputDialog("Enter a distance or a weight amount");
		
		// Finds index of where the space is
		int indexSpace = userInput.indexOf(" ");
		int stringLength = userInput.length();
		// System.out.println(indexSpace);
		
		String unit = userInput.substring(indexSpace, stringLength); // Stores unit like cm, in, etc...
		String measurement = userInput.substring(0,indexSpace);
		
		double imeasurement = Double.parseDouble(measurement);
		
		if(unit.equalsIgnoreCase(" cm")){
			imeasurement = imeasurement * 0.393701;
			JOptionPane.showMessageDialog(null, userInput + " = " + imeasurement + " in");
		}
		else if(unit.equalsIgnoreCase(" in")){
			imeasurement = imeasurement * 2.54;
			JOptionPane.showMessageDialog(null, userInput + " = " + imeasurement + " cm");
		}
		else if(unit.equalsIgnoreCase(" yd")){
			imeasurement = imeasurement * 0.9144;
			JOptionPane.showMessageDialog(null, userInput + " = " + imeasurement + " m");
		}
		else if(unit.equalsIgnoreCase(" m")){
			imeasurement = imeasurement * 1.09361;
			JOptionPane.showMessageDialog(null, userInput + " = " + imeasurement + " yds");
		}
		else if(unit.equalsIgnoreCase(" oz")){
			imeasurement = imeasurement * 28.3495;
			JOptionPane.showMessageDialog(null, userInput + " = " + imeasurement + " gm");
		}
		else if(unit.equalsIgnoreCase(" gm")){
			imeasurement = imeasurement * 0.035274;
			JOptionPane.showMessageDialog(null, userInput + " = " + imeasurement + " oz");
		}
		else if(unit.equalsIgnoreCase(" lb")){
			imeasurement = imeasurement * 0.453592;
			JOptionPane.showMessageDialog(null, userInput + " = " + imeasurement + " kg");
		}
		else if(unit.equalsIgnoreCase(" kg")){
			imeasurement = imeasurement * 2.20462;
			JOptionPane.showMessageDialog(null, userInput + " = " + imeasurement + " lb");
		}
		else
			JOptionPane.showMessageDialog(null, "Error");

		
		
		
		
		

	}

}
