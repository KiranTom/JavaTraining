// To compare three values to check if they are equal, different, or neither

import java.util.Scanner;

class EqualOrDifferent{

	public static void main(String[] args){

		int num1,num2,num3;

		Scanner s = new Scanner(System.in);

		System.out.println("Input First number : ");
		num1 = s.nextInt();

		System.out.println("Input Second number : ");
		num2 = s.nextInt();

		System.out.println("Input Third number : ");
		num3 = s.nextInt();

		if((num1 == num2) && (num1== num3) && (num2 == num3)){	// all are equal

			System.out.println("All numbers Are equal");		

		}	

		else if((num1 != num2) && (num1 != num3) && (num2 != num3)){	// all are different

			System.out.println("All numbers are different");

		}

		else{

			System.out.println("Neither all are equal nor different");

		}
	}
}
