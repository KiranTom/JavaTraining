// To check whether a number is positive, negative or zero


import java.util.Scanner;

class PositiveNegativeOrZero{

        public static void main(String[] args){

                int num;

                Scanner s = new Scanner(System.in);

                System.out.println("Input the number: ");
                num = s.nextInt();

                if(num>0){		// positive

                        System.out.println("Number is positive");

                }

                else if(num == 0){	// zero

                        System.out.println("Number is zero");

                }

                else{		// negative

                        System.out.println("Number is negative");

                }
        }
}

