// To calculate sum, difference, product, average, distance, maximum and minimum of two given integers

import java.util.Scanner;

class Calculator{

	public static void main(String[] args){

		int a,b,add,sub,mul,avg,distance,max,min;

		Scanner s = new Scanner(System.in);
		System.out.println("Input 1st integer : ");
		a = s.nextInt();
		System.out.println("Input 2nd integer : ");
		b = s.nextInt();

		add = a+b;		// addition
		sub = a-b;		// subtraction
		mul = a*b;		// multiplication
		avg = (a+b)/2;		// average

		if (a>b){		// To calculate maximum, minimum and distnace
			max = a;
			min = b;
			distance = a-b;
		}

		else{
			max = b;
			min = a;
			distance = b-a;
		}

		System.out.println("Sum of two integers: "+add);
		System.out.println("Difference of two integers: "+sub);
		System.out.println("Product of two integers: "+mul);
		System.out.println("Average of two integers: "+avg);
		System.out.println("Distance of two integers: "+distance);
		System.out.println("Max integer "+max);
		System.out.println("Min integer "+min);
	}
}
~                                        
