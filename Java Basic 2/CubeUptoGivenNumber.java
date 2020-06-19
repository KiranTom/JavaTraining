// To calculate the cube of numbers up to n terms

import java.util.Scanner;

class CubeUptoGivenNumber{

	public static void main(String[] args){

		int cube = 0,num,i;

		Scanner s = new Scanner(System.in);

		System.out.println("Input the number of terms : ");
		num = s.nextInt();

		for(i=1;i<=num;i++){    // getting input n times

			cube = i*i*i;	   // cube formula
			System.out.println("Number is: "+i+" and the cube of "+i+" is: "+cube);

		}
	}
}
