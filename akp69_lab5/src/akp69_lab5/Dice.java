package akp69_lab5;
import java.util.Random;
import javax.swing.JOptionPane;

public class Dice 
{
	
	public static void main(String[] args)	
	{
		
		int count = 0;
		
		
		while(count == 0) 
		{
			String userInput= JOptionPane.showInputDialog("Enter your desired number of rolls");
			int iUserInput = Integer.parseInt(userInput);
			Random dice = new Random();
			RollDice(iUserInput,dice);
			String driver = JOptionPane.showInputDialog("If you would like to end the program, enter -1 to quit. Else enter any number to continue");
			int iDriver = Integer.parseInt(driver);
			
			if(iDriver == -1) 
			{
				count = 1;
			}
						
		}
		
	}
	
	public static void RollDice(int numRolls, Random dice)
	{
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;
		int count8 = 0;
		int count9 = 0;
		int count10 = 0;
		int count11= 0;
		int count12= 0;
		int roll = 0;

		
		for(int x = 0; x < numRolls; x++) 
		{
			int dice1 = 1 + dice.nextInt(6);
			int dice2 = 1 + dice.nextInt(6);
			roll = dice1 + dice2;
			
			if(roll == 2)
			{
				count2++;
			}
			if(roll == 3)
			{
				count3++;
			}
			if(roll == 4)
			{
				count4++;
			}
			if(roll == 5)
			{
				count5++;
			}
			if(roll == 6)
			{
				count6++;
			}
			if(roll == 7)
			{
				count7++;
			}
			if(roll == 8)
			{
				count8++;
			}
			if(roll == 9)
			{
				count9++;
			}
			if(roll == 10)
			{
				count10++;
			}
			if(roll == 11)
			{
				count11++;
			}
			if(roll == 12)
			{
				count12++;
			}
			
		}
		System.out.println("Value\tFraction");
		System.out.println("2" + "\t" + count2 + "/" +(numRolls));
		System.out.println("3" + "\t" + count3 + "/" +(numRolls));
		System.out.println("4" + "\t" + count4 + "/" +(numRolls));
		System.out.println("5" + "\t" + count5 + "/" +(numRolls));
		System.out.println("6" + "\t" + count6 + "/" +(numRolls));
		System.out.println("7" + "\t" + count7 + "/" +(numRolls));
		System.out.println("8" + "\t" + count8 + "/" +(numRolls));
		System.out.println("9" + "\t" + count9 + "/" +(numRolls));
		System.out.println("10" + "\t" + count10 + "/" +(numRolls));
		System.out.println("11" + "\t" + count11 + "/" +(numRolls));
		System.out.println("12" + "\t" + count12 + "/" +(numRolls));
	
	
	}
}

