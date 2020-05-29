// To calculate the BMI using height and weight (in inches and pounds respectively)

import java.util.Scanner;

class Bmi{

	public static void main(String[] args){

		double h,w,bmi;

		Scanner s = new Scanner(System.in);
		System.out.println("Input weight in pounds: ");
		w = s.nextDouble();
		System.out.println("Input height in inches: ");
		h = s.nextDouble();

		bmi = (w*703)/(h*h) ;	     // BMI formula

		System.out.println("Body Mass Index is: "+bmi);	
	}
}
