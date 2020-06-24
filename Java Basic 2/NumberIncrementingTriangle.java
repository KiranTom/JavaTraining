// To create a right angle triangle with numbers incrementing by one EVERYTIME

import java.util.Scanner;

class NumberIncrementingTriangle{

	public static void main(String args[]){

		int num,i,j,n=1;

		Scanner s = new Scanner(System.in);

		System.out.println("Input number to get number triangle : ");
		num = s.nextInt();

		for(i=1;i<=num;i++){    // start loop for i upto num rows

			for(j=1;j<=i;j++)      // start loop for j upto i

				System.out.print(n++); // print i's current value
				System.out.println(""); // once j loop is over it goes to next line by using println
		}
	}
}

