// To break given integer into individual digits

import java.util.Scanner;

class BreakDigit{

	public static void main(String[] args){

		int num;
		int temp = 0;
		int reverse = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("Input six non negative digits : ");
		num = s.nextInt();
		
		// Given integer is reversed because while breaking into individual digits the output will be reversed
		
		while(num!=0){		// reversing the number

			reverse = reverse*10;
			reverse = reverse + num%10;
			num= num/10;	
		}

		while(reverse>0){	// breaking integer into individual digits

			temp = reverse%10;
			reverse = reverse/10;
			System.out.print(temp+" ");
		}
	}
}
