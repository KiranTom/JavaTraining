// To check if 2 floating point numbers are same up to 3 places

import java.util.Scanner;

public class CompareFloat{

	public static void main(String[] args){

		double x,y;

		Scanner s = new Scanner(System.in);

		System.out.print("Input floating-point number: ");
		x = s.nextDouble();
		System.out.print("Input floating-point another number: ");
		y = s.nextDouble();

		x = Math.round(x * 1000);	// Multiplying the value by 1000 (3 places) and round it off
		x = x / 1000;			// divide the rounded off value by 1000

		y = Math.round(y * 1000);
		y = y / 1000;

		/* Now we get two values where the digits after 3rd decimal place DOES NOT matter
		 and the digits before the 3rd decimal places are used to compare the values */

		if (x == y)
		{
			System.out.println("They are the same up to 3 decimal places");
		}

		else
		{
			System.out.println("They are different");
		}
	}
}
