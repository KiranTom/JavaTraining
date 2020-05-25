// To convert temperature from FARENHEIT to CELSIUS

import java.util.Scanner;

class Temperature{

	public static void main (String[] args){

		float far,cel;
		Scanner s = new Scanner(System.in);
		System.out.println("Input a degree in FARANHEIT :");
		far = s.nextFloat();

		cel = ((far-32)*5)/9;  // Formula used for conversion

		System.out.println(far+"degree Farenheit is equal to "+cel+"in celcius");
	}
}

