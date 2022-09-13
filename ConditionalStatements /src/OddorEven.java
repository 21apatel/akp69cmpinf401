import javax.swing.JOptionPane;

public class OddorEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String userInput = JOptionPane.showInputDialog("Please enter a number");
	       int userInputNum = Integer.parseInt(userInput);
	      
	       System.out.println(userInputNum%2);
	      
	       if(userInputNum%2 == 0)
	       {
	           System.out.println("Even");
	       }
	       else
	       {
	           System.out.println("Odd");
	       }


	}

}
