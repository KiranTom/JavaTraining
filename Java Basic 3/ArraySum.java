// To sum values in an array

import java.util.Scanner;

class ArraySum{

	public static void main(String[] args){

		int sum=0,i,num;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter number of elements: ");
		num = s.nextInt();

		int a[] = new int[num];	// Declaring an array

		System.out.println("Enter your elements: ");

		for(i=0 ; i<num ; i++){

			a[i] = s.nextInt();	// giving values to array num times
			sum = sum + a[i];	// adding the arrays

		}

		System.out.println("SUM IS : "+sum);

	}
}
