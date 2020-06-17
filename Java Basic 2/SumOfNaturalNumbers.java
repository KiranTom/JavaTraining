// To print the n natural numbers and their sum

import java.util.Scanner;

class SumOfNaturalNumbers{

	public static void main(String[] args){

		int num=1,i,n,count=0;

		Scanner s = new Scanner(System.in);

		System.out.println("Input the number");
		n = s.nextInt();

		for(i=0;i<n;i++){	// running the loop n number of times

			System.out.println(num);
			count = count + num;	// sum is being added in every loop
			num++;
		}

		System.out.println("The sum of natural numbers upto n terms : "+count);
	}

}

