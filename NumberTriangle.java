// To create a right angle triangle with numbers incrementing each row

import java.util.Scanner;

class NumberTriangle{

	public static void main(String args[]){

		int num,i,j;

		Scanner s = new Scanner(System.in);

		System.out.println("Input number to get number triangle : ");
		num = s.nextInt();

		for(i=1;i<=num;i++){	// start loop for i upto num rows

			for(j=1;j<=i;j++){	// start loop for j upto i

				System.out.print(i+"");	// print i's current value
			}
			System.out.println("");	// once j loop is over it goes to next line by using println
		}
	}
}
