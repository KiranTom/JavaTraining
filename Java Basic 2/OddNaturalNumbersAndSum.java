// To print num terms of odd natural numbers and find sum 

import java.util.Scanner;

class OddNaturalNumbersAndSum{

	public static void main(String[] args){

		int num,i,sum = 0;

		Scanner s = new Scanner(System.in);

		System.out.println("Input number of terms : ");
		num = s.nextInt();

		System.out.println("The odd numbers are :");

		for(i=1;i<=num;i=i+2){      // starts with i=1 till the given number.... increments by two to maintain odd numbers

			System.out.println(i+"");
			sum =  sum + i;		// Sum of these numbers
		}
		System.out.println("Sum of odd natural numbers upto "+num+" term is: "+sum);
	}
}
