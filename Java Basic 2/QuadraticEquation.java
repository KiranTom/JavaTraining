// To calculate the roots of the given quadratic equation

import java.util.Scanner;
import java.lang.Math;

class QuadraticEquation{

	public static void main(String[] args){

		int a,b,c,d;
		double sqt,x,y;

		Scanner s = new Scanner(System.in);

		System.out.println("Input a");
		a = s.nextInt();

		System.out.println("Input b");
		b = s.nextInt();

		System.out.println("Input c");
		c = s.nextInt();
		
		// Formula

		d = (b*b)-4*a*c;	//b square minus 4ac
		sqt = Math.sqrt(d);	//root bsquare minus 4ac

		if(sqt > 0){

			x = (-b+sqt)/2*a;	//-b + bsquare minus 4ac by 2a
			y = (-b-sqt)/2*a;	//-b - bsquare minus 4ac by 2a

			System.out.printf("The roots are "+x+" and "+y);
		}

		else if(sqt == 0){

			x = -b/2*a;		// since sqt is 0 , ignore sqt
			y = x;

			System.out.printf("The roots are "+x+" and "+y);
		}

		else{
	
			System.out.println("The roots are imaginary number !!");	// since sqt is minus, roots will be imaginary number

		}
	}
}

