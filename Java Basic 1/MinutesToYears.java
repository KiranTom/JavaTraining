// To convert given minutes into years and days

import java.util.Scanner;

class MinutesToYears{

	public static void main(String[] args){

		int minutes,days,years,d;

		Scanner s = new Scanner(System.in);
		System.out.println("Input the number of minutes: ");
		minutes = s.nextInt();

		days=minutes/1440;          // To calculate days using minutes
		years=days/365;	   // To calculate years using days
		d = days-(years*365);  // To calculate the final output 
		System.out.println(minutes+" minutes is approximately "+years+" years and "+d+" days");
	}
}
