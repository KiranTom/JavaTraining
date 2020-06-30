//To design Pascal triangle

import java.util.Scanner;

class PascalTriangle{

	public static void main(String[] args){

		int c=1,i,j,k,row;

		Scanner s = new Scanner(System.in);

		System.out.println("Input number of rows");
		row = s.nextInt();

		for(i=0;i<row;i++){

			c = 1;
	
			for(k=0;k<=i;k++){	// k from 0 to i for printing number

				System.out.print(c+" ");

				c = c*(i-k)/(k+1);	// formula to increase c value for every iteration
			}		
			System.out.println();
		}
	}
}
