//To check if a given year is leap year or not

import java.util.Scanner;

class LeapYear{
	
	public static void main(String[] args){

	int year;

	Scanner s = new Scanner(System.in);

	System.out.println("Input the year : ");
	year = s.nextInt();
	
	if ((year%400 == 0) || ((year%100 != 0) && (year%4 ==0))){	// condition to check if the year is leap year or not

		System.out.println(year+" is a leap year");	

		}

	else {

		System.out.println(year+"is not a leap year");		

		}
	}
}