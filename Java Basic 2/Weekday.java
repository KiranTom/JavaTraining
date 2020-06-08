// To find the weekday when the number is given

import java.util.Scanner;

class Weekday{

	public static void main(String [] args){

		int n;

		Scanner s = new Scanner(System.in);
		System.out.println("Input number : ");
		n = s.nextInt();

		switch(n){	// Using switch case to select any case from 1 to 7

			case 1 : System.out.println("Monday");
				 break;

			case 2 : System.out.println("Tuesday");
				 break;

			case 3 : System.out.println("Wednesday");
				 break;

              		case 4 : System.out.println("Thursday");
				 break;

			case 5 : System.out.println("Friday");
				 break;

			case 6 : System.out.println("Saturday");
			         break;
	
			case 7 : System.out.println("Sunday");
				 break;

			default : System.out.println("ONLY 7 DAYS IN A WEEK !!!");
				 break;
		 }
 	}
 }
