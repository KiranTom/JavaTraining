//To find all pairs of elements in an array whose sum is equal to a specified number

import java.util.Scanner;

class SumEqualsValue{

	public static void main(String[] args){

		int num,i,j;

		int[] a = {1,2,3,4,5,6,7,8,9,0};

		Scanner s = new Scanner(System.in);

		System.out.println("Enter any element : ");
		num = s.nextInt();

		System.out.println("The pairs equal to the number : "+num+" is");

		for(i=0; i<a.length; i++){		//Checking every pair

			for(j=0; j<i; j++){

				if((a[i] + a[j]) == num){

					System.out.println(a[i]+" "+a[j]);	

				}			
			}
		}
	}
}
