// To compare three values if its decreasing or increasing

import java.util.Scanner;

class IncreaseOrDecrease{

        public static void main(String[] args){

                int num1,num2,num3;

                Scanner s = new Scanner(System.in);

                System.out.println("Input First number : ");
                num1 = s.nextInt();

                System.out.println("Input Second number : ");
                num2 = s.nextInt();

                System.out.println("Input Third number : ");
                num3 = s.nextInt();

                if((num1 < num2) && (num1 < num3) && (num2 < num3)){  // incresing

                        System.out.println("Increasing order");

                }

                else if((num1 > num2) && (num1 > num3) && (num2 > num3)){    // decreasing

                        System.out.println("Decreaseing order");

                }

                else{   // neither increasing nor decreasing

                        System.out.println("Neither increasing nor decreasing");

                }
        }
}

