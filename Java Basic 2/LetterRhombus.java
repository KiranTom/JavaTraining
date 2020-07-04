// To design Rhombus using alphabets

import java.util.Scanner;

public class LetterRhombus{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Input the number: ");
		int n = sc.nextInt();

		int count = 1;
		int count2 = 1;
		char c = 'A';

		for (int i = 1; i < (n * 2); i++) 
		{
			for (int spc = n - count2; spc > 0; spc--)   
				//print space
			{
				System.out.print(" ");
			}
				if (i < n) 
				{
					count2 = count2 + 1;
				} 
				else 
				{
					count2 = count2 - 1;
				}
			for (int j = 0; j < count; j++) 
			{
				System.out.print(c);//print Character
				if (j < count / 2) 
				{
					c++;	// changing to the next alphabet
				} else 
				{
					c++;	// changing to previous letter to get rhombus shape
				}
			}
				if (i < n)
				{
					count = count + 2;
				} 
				else
				{
					count = count - 2;
				}
		
			System.out.println();
		c = 'A';	// Reassigning the first letter of line as A so that it stars with A in every iteration
		}		
	}
}
