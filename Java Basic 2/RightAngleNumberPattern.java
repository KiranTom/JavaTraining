// To create right angle triangle pattern with numbers

import java.util.Scanner;

class RightAngleNumberPattern{

	public static void main(String[] args){

		int num,i,j;

		Scanner s = new Scanner(System.in);

		System.out.println("Input number of rows : ");
		num = s.nextInt();

		// once j value exceeds i value itll go to next line and print , giving the triangle shape

		for(i=1;i<=num;i++){	// initiating the first loop

			for(j=1;j<=i;j++)	// 2 loop and printing j value

				System.out.print(j);
				System.out.println(""); 
		}
	}
}

