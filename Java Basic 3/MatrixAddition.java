// To add 2 matrices of the same size

import java.util.Scanner;

class MatrixAddition{

	public static void main(String[] args){

		int i,j;
		int x,y;
		
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the number of rows : ");
		x = s.nextInt();

		System.out.println("Enter the number of cloumns");
		y = s.nextInt();

		// Setting up all matrices

		int[][] a = new int[x][y];
		int[][] b = new int[x][y];
		int[][] c = new int[x][y];

		// Matrix 1
		
		System.out.println("Enter the values of first matrix \n");

		for(i=0; i<x; i++){

			for(j=0; j<y; j++){

				a[i][j] = s.nextInt();

			}
		}
		// Matrix 2
		
		System.out.println("Eneter the values for second matrix \n");

		for(i=0; i<x; i++){

			for(j=0; j<y; j++){

				b[i][j] = s.nextInt();

			}	
		}

		System.out.println("Sum of these matrices are : ");	

		// Matrix addition

		for(i=0; i<x; i++){

			for(j=0; j<y; j++){

				c[i][j] = a[i][j] + b[i][j];

			}
		}
		
		// Matrix result display
		
		for(i=0; i<x; i++){

			for(j=0; j<y; j++){

				System.out.print(c[i][j]+"   ");
			}
				System.out.println();
		}
	}
}
