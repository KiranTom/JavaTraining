// To find sum and average of 5 given inputs

import java.util.Scanner;

class SumAndAverage{

	public static void main(String[] args){
	
		int i,sum=0;
		int n;
		double average = 0;

		Scanner s = new Scanner(System.in);

		System.out.println("Input the 5 number : ");

		for(i=0;i<5;i++){		// getting input and summing up 5 times

			n = s.nextInt();
			sum = sum + n;
		}
	
		average = sum/5;		// calculating avg

		System.out.println("The sum of 5 no. is :"+sum);
		System.out.println("The average is :"+average);
	}
}
