// To convert length from inches to meters

import java.util.Scanner;

class InchesToMeters{

	public static void main(String[] args){

		double inch,meter;

		Scanner s = new Scanner(System.in);
		System.out.println("Input a value for inch:");
		inch = s.nextDouble();

		meter = inch*0.0254;	// Formula for conversion

		System.out.println(inch+" inch is "+meter+"meters");
	}
}
~                                                                                                                                                                      
~                                                                                                                                                                      
~                                                                                                                                                                                
