// To design star shaped triangle

import java.util.Scanner;

class StarTriangle{

	public static void main(String[] args){

		int num,i,j;

		Scanner s = new Scanner(System.in);

		System.out.println("Input the number : ");
		num = s.nextInt();

		for(i=num;i>=1;i--){	// loop from size of num to 1

			for(j=1;j<=i;j++){	// loop to print

				System.out.print("* "); // Design 

			}

			System.out.println("");
		}
	}	
}
