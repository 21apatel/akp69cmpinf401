import javax.swing.JOptionPane;

public class Palindrome {
	
	// What is a palindrome - A word of a phase that reads the same backwards and forwards
	// Should ignore capitalization
	// Ignore everything that's not a letter
	
	/*
	 * 1. User provides input
	 * 2. Convert everything to lower case
	 * 3. Remove all non-letter characters
	 * 4. Reverse the word
	 * 5. Compare the two strings
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. User provides input
		String phrase = JOptionPane.showInputDialog("Please enter a word or a phase: ");
		
		// 2. Convert everything to lower case
		phrase = phrase.toLowerCase();
		
		// 3. Remove all non-letter charaters
		/*
		 * a. Iterate through all characters in the input string
		 * b. If a character is a lowerccase letter, keep it, otherwise ignore it
		 */
		
		char letter = 'x';
		int lowerBound = (int) 'a';
		int upperBound = (int) 'z';
		int asciiLetter = (int) letter;
		String cleanPhrase = "";
		
		for(int i = 0; i < phrase.length(); i++) {
			
			letter = phrase.charAt(i);
			asciiLetter = (int) letter;
			
			if(asciiLetter >= lowerBound && asciiLetter <= upperBound) {
				cleanPhrase = cleanPhrase + letter;
			}
		}
		
		System.out.println("Removed non-letter chars: " + cleanPhrase);
		
		// 4. Reverse the phrase

		String reversedPhrase = "";
		
		for(int i = cleanPhrase.length()-1; i >= 0; i--) {
			reversedPhrase += cleanPhrase.charAt(i);
		}
		
		System.out.println("Reversed string: " + reversedPhrase);
	
		// 5. Compare two strings
		if(cleanPhrase.equals(reversedPhrase)) {
			System.out.println(phrase + " is a palindrome");
		}
		else {
			System.out.println(phrase + " is a NOT palindrome");
		}

	}

}
