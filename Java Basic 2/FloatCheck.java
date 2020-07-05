// To check if the given float is negative or positive or zero


import java.util.Scanner;

class FloatCheck{

	public static void main(String[] args){

		float num;

		Scanner s = new Scanner(System.in);

		System.out.println("Input a number : ");
		num = s.nextFloat();

		if(num < 0){	// negative

			if(Math.abs(num) < 1){

			System.out.println("NEGATIVE SMALL NUMBER");

			}
			
			else if(Math.abs(num) > 1000000){

				System.out.println("NEGATIVE LARGE NUMBER");		

			}
			
			else {
	
				System.out.println("NEGATIVE NUMBER");
	
				}
		}

		else if(num > 0){	// positive
			if(num<1){

			System.out.println("POSITIVE SMALL NUMBER");
						
			}		
			else if (num>1000000){
				
			System.out.println("POSITIVE LARGE NUMBER");	
			
			}
			
			else {

				System.out.println("POSITIVE NUMBER");

			}
		}

		else{	// zero

			System.out.println("ZERO");	

		}

			 
	}
}
