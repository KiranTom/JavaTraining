// To check for a specific value in an array
// This program is executed using exception handling basics (first try)
import java.util.Arrays;
import java.util.Scanner;
class CheckSpecificValue{

	public static void main(String[] args){


		int i,value;
		int[] a = {3,4,1,8,9};
		int x = 1;
		boolean found = false;	
		Scanner s = new Scanner(System.in);

		do {		// to the pgm again n again till the correct value is given

			try{	// exception handling 

				System.out.println(" "+Arrays.toString(a));
				System.out.println("Enter a number to check : ");
				
				value = s.nextInt();
				for(i=0; i<5; i++){	// running 5 times cos 5 elements

					if(a[i] == value){	// checking for the value
						found = true;	// boolean vaue to true
						System.out.println("The value "+value+" is present in the array");
						x = 2;  //going out of the loop

					}	
				}
				if(!found){	// found is false
					System.out.println("Not found");
					s.nextLine();
				}
			}

			catch(Exception e){	// exception if the user inputs wrong value

				System.out.println("You cant do that");
				s.nextLine();

			}
		}while(x==1);	// keeps running till the value of x changes
	}
}
