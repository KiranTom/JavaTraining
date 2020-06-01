// To calculate the square, cube and fourth power of an integer

import java.util.Scanner;

class CalculatePower{

	public static void main(String[] args){

		int num,square,cube,fourth;

		Scanner s = new Scanner(System.in);
		System.out.println("Input :");
		num = s.nextInt();

		square = num*num;	  // calculating square
		cube = square*num;	  // calculating cube
		fourth = cube*num;	  // calculating fourth power

		System.out.println("Square :  "+square);
		System.out.println("Cube : "+cube);
		System.out.println("Fourth Power :"+fourth);

	}
}
