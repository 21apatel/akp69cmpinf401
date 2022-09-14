
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Forward Loop
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// Backward Loop
		for(int i = 10; i >=1; i--) {
			System.out.println(i);
		}
		
		// Looping through a string
		String temp = "Hello World";
		for(int i = 0; i <temp.length(); i++)
		{
			System.out.println(temp.charAt(i));
		}
		
		for(int i = temp.length()-1; i >= 0; i--)
		{
			System.out.println(temp.charAt(i));
		}
		
		
		
	}

}
