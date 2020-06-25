//To create a pyramid triangle with numbers incrementing each row

import java.util.Scanner;

class IncrementingNumberPyramid{

     public static void main(String args[]){

             int num,x=1;	//Number which will later increment in every row

             Scanner s = new Scanner(System.in);

             System.out.println("Input number to get number triangle : ");
             num = s.nextInt();

             for(int i=0;i<=num;i++){    // start loop for i upto num rows

                     for(int j=num-i;j>1;j--){      // loop to determine total number of space for the specific row

                             System.out.print(" "); 
                     }
                     for (int j=0; j<=i; j++ ){		// loop to print n, i number of times
                    	 
                         System.out.print(x+" "); 
                     } 
                     x++;	// increment to get an incremented pyramid rather than a single number pyramid
                     System.out.println();
             }
     }
}
