// To design floyd's triangle using BINARY values

import java.util.Scanner;

class BinaryFloydsTriangle{

	public static void main(String[] args){

		int n,i,j;

		Scanner s = new Scanner(System.in);

		System.out.println("Input the number of rows: ");
		n = s.nextInt();

		for(i=0;i<n;i++){

			for(j=0;j<=i;j++){	// j loop till i times (means a triangle can be created)

				if ((i+j)%2 == 0){	// to print 0,using current i and j values

					System.out.print("0");				

				}
				else{	// printing 1 same way

					System.out.print("1");

				}
				System.out.print("  ");	// space between the binary values using j loop

			}	
			System.out.println(""); // jumping into the next line using i loop
		}
	}	
}
