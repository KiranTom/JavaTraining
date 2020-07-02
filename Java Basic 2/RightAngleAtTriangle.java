// To design a right angle triangle with '@'

import java.util.Scanner;

class RightAngleAtTriangle{

        public static void main(String[] args){

                int num,i,j;

                Scanner s = new Scanner(System.in);

                System.out.println("Input the number : ");
                num = s.nextInt();

                for(i=1;i<=num;i++){    // loop from size of num to 1

                        for(j=1;j<=i;j++){      // loop to print

                                System.out.print("@ "); // Design 

                        }

                        System.out.println("");
                }
        }
}

