// To generate multiplication table for given integer

import java.util.Scanner;

class MultiplicationTable{

	public static void main(String[] args){

		int num,i,mul = 0;

		Scanner s = new Scanner(System.in);

		System.out.println("Input the number (the multiplication table to be calculated)");
		num = s.nextInt();

		for(i=0;i<=10;i++){         // getting input upto num times

			mul = i*num;		   // performing multiplication	

			System.out.println(num+" X "+i+" = "+mul);
		}
	}
}
