import javax.swing.JOptionPane;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // if statement is like a fork in the road. Depending upon a decision, different parts of the program are executed.
	       String userInput = JOptionPane.showInputDialog("Pleasae enter a number");
	       int userInputInt = Integer.parseInt(userInput);
	      
	       if(userInputInt == 7)
	       {
	           System.out.println("Lucky number");
	       }
	       else
	       {
	           System.out.println("Pick another number");
	       }


	}

}
