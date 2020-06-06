// To find the greatest of three given numbers

import java.util.Scanner;

class GreatestOfThreeNumbers{

	public static void main(String[] args){

		float a,b,c;

		Scanner s = new Scanner(System.in);

		System.out.println("Input a");
		a = s.nextFloat();

		System.out.println("Input b");
		b = s.nextFloat();

		System.out.println("Input c");
		c = s.nextFloat();

		if(a>b && a>c){   //check if a is greatest

			System.out.println("The greatest: "+a);			

		}

		else if(b>a && b>c){   //check if b is greatest

			System.out.println("The greatest:"+b);

		}
		else{   // else c is obviosly the greatest

			System.out.println("The greatest:"+c);
		}
	}
}

