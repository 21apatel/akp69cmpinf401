
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String temp = "Hello World";
		
		// Getting a character at a specified index/position
		System.out.println(temp.charAt(0));
		System.out.println(temp.charAt(3));
		
		System.out.println((int) temp.charAt(3));
		
		// Getting an index of a character
		System.out.println(temp.indexOf('H'));
		System.out.println(temp.indexOf('x'));
		
		if(temp.indexOf('x') == -1) {
			System.out.println("Not found");
			
		}
		else
		{
			System.out.println("Found at position " + temp.indexOf('o'));
		}
		
		// Getting part of a string
		System.out.println(temp.substring(6));
		System.out.println(temp.substring(6,8));
		
		// Replace characters or substrings
		System.out.println(temp.replace('o', 'z'));
		System.out.println(temp.replace("World", "universe"));
		


	}

}
