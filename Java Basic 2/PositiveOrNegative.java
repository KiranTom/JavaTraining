// To check whether the given integer is positive or negative

import java.util.Scanner;

class PositiveOrNegative{

        public static void main(String[] args){

                int num;

                Scanner s = new Scanner(System.in);
                System.out.println("Input number: ");
                num = s.nextInt();

                if(num>=0){		// checking if positive

                        System.out.println("Number is positive");
                }
                else{			// checking if negative

                        System.out.println("Number is negative");
                }
        }
}

