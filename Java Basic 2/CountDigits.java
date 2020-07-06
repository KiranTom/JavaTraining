// To count the total digits of a positive number


import java.util.Scanner;

class CountDigits{

	public static void main(String[] args){

		int num;
		float temp = 0;
		int count=0;

		Scanner s = new Scanner(System.in);

		System.out.println("Input a number : ");
		num = s.nextInt();

		while(num>0){ //Splitting the number

			temp = num%10;
			num = num/10;
			count = count+1;	// counting each time the loop runs				

		}

		System.out.println("Number of digits in the number : "+count);
	}
}
