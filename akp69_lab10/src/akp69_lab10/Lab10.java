package akp69_lab10;

public class Lab10 {

	public static void main(String args[]) {
		
		// first method
		System.out.println(sumOfDigits(234));
		
		// second method
		int[] arr = new int[] {1,2,3,4,5};
		printArrayElements(arr, 0);
		
		// third method
		
		
	}
	
	public static int sumOfDigits(int x) {
		
		int posx = Math.abs(x);
		// base case
		if(posx > -1 && posx < 10)
			return posx;
		// everything else
		else 
			return(posx%10 + sumOfDigits(posx/10));
			 
	}
	
	public static void printArrayElements(int a[], int index)
	{
		if(index == a.length) {
			return;
		}
		else {
			System.out.println(a[index]);
			printArrayElements(a, index + 1);
		}
	}
	
	public static void printCombos(int[] a, String out, int startIndex, int k) {
	
		
		
	}
	
	/**
	 * PSUEDOCODE
	 * k = 3 example
	 * Each possible startIndex we add that element to our string
	 * Recurse to find each possible combination
	 * 2 length combinations found by considering each HIGHER startingIndex
	 * Each startIndex add corresponding element to our string
	 * Recurse to find each 1 length combination
	 * Each startIndex we add the element to String
	 * Recurse to find the valid length 0 combinations
	 * Since length 0 is just empty string just print out the string 
	 */
	
	
}
