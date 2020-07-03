// To create number rhombus design


import java.util.Scanner;

public class NumberRhombus {

	public static void main(String args[]){

		Scanner in = new Scanner(System.in);

		System.out.print("Input the number:  ");

		int num = in.nextInt();
		int count = 1;
		int spaces = 1;
		int start = 0;

		for (int i = 1; i < (num * 2); i++) 
		{

			for (int j = num - spaces; j > 0; j--) 
			{
				System.out.print(" ");
			}
			if (i < num) 
			{
				start = i;          //for number
				spaces++;    //for spaces
			} else 
			{
				start = num * 2 - i;   //for number
				spaces--;      //for space
			}
			for (int k = 0; k < count; k++) 
			{
				System.out.print(start);
				if (k < count / 2) 
				{
					start--;
				} else 
				{
					start++;
				}
			}
			if (i < num)
			{
				count = count + 2;
			} else {
				count = count - 2;
			}

			System.out.println();
		}
	}
}
