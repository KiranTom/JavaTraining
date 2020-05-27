// To add all the digits of a number between 1 and 1000

import java.util.Scanner;

class AddDigit{

	public static void main(String[] args){

		int num,numb;
		int temp=0;

		Scanner s = new Scanner(System.in);
		System.out.println("Input an integer between 0 and 1000 :");
		num = s.nextInt();
		numb = num;

		if (num>0 && num<1000){        // To input numbers only between 1 and 1000
  
			while(num>0){          // To seperate the digits and add 

				temp = temp+(num%10);
				num = num/10;
			}

			System.out.println("The sum of all digits in "+numb+" is "+temp);
		}

		else {
			System.out.println("YOU DID NOT ENTER BETWEEN THE RANGE 0 to 1000");
		}
	}
}

