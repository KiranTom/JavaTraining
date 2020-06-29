// To design Diamond Shape with '*'

import java.util.Scanner;

public class DiamondPattern	{

	public static void main(String[] args) {

		int rows, i, j, k =0;
		System.out.print("Enter the number of rows: ");
		Scanner s = new Scanner(System.in);
		rows = s.nextInt();

		// UPPER HALF
		k = rows - 1;

		for (i = 1; i <= rows; i++) {

			for (j = 1; j <= k;j++) {

				System.out.print(" ");	// To print the invisible triangle of upper side(part of the triangle without stars)

			}
			k--;
			
			for (j = 1; j <= 2 * i - 1; j++) {

				System.out.print("*");                

			}
			System.out.println("");
		}
		k = 1;

		for(i = 1;i <= rows-1; i++){	// spacing lower
				
			for(j = 1 ; j <= k ;j++){	

				System.out.print(" ");

			}
			k++;

			for(j = 1 ;j<=2*(rows-i)-1;j++){	// printing *

				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
