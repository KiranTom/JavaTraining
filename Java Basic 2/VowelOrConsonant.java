// To check if a character is vowel or consonant

import java.util.Scanner;
public class VowelOrConsonant{


	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.print("Input an alphabet: ");
		String input = s.nextLine().toLowerCase();

		//boolean capital = input.charAt(0) >= 65 && input.charAt(0)<= 90;	// Askew values for capital letters
		boolean small = input.charAt(0) >= 97 && input.charAt(0)<= 122;	// Askew values for small leters
		boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")	// Vowels ie a,e,i,o,u
			|| input.equals("o") || input.equals("u");

		// charAt(0) is to use the first character which is the only character



		if (input.length() > 1)			// character length
		{
			System.out.println("Error more than one character");
		}
		else if (!(small))	// non-letters	
		{
			System.out.println("Error. Not a letter");
		}
		else if (vowels)			// vowels
		{
			System.out.println("Input letter is Vowel");
		}
		else					// consonants
		{
			System.out.println("Input letter is Consonant");
		}
	}
}
