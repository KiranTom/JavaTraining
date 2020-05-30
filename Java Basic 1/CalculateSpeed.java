// To calculate the speed when distance and time is given

import java.util.Scanner;

class CalculateSpeed{

	public static void main(String[] args){

		double ms,kh,mh,distance,hours,minutes,seconds,time;

		Scanner obj = new Scanner(System.in);
		System.out.println("Input distance in metres: ");
		distance = obj.nextDouble();
		System.out.println("Input hour: ");
		hours = obj.nextDouble();
		System.out.println("Input minutes: ");
		minutes = obj.nextDouble();
		System.out.println("Input Seconds: ");
		seconds = obj.nextDouble();

		time=(hours*3600)+(minutes*60)+seconds; // Time in seconds

		ms = distance/time;	     // Speed in m/s
		kh = ms*3.6;	     // Speed in km/h
		mh = ms*2.237;	     // Speed in Miles/h

		System.out.println("Your speed in meter/second is "+ms);
		System.out.println("Your speed in km/h is "+kh);
		System.out.println("Your speed in miles is "+mh);

	}
}
