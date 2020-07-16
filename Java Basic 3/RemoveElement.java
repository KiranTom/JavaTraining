// To remove an element from an array

import java.util.Arrays;
import java.util.Scanner;

class RemoveElement{

	public static void main(String[] args){

		int num,i,x=1,j;
		boolean condition = false;

		Scanner s = new Scanner(System.in);

		int[] a = {1,2,3,4,5,6,7,8,9};
		int size = a.length;

		do{
			try{	

				System.out.println("Select any number you want to remove from this list : "+Arrays.toString(a));
				num = s.nextInt();

				for(i=0; i<a.length; i++){	//checking for the same value

					if (a[i] == num){

						condition = true;

						for(j=i; j<a.length-1; j++){

							a[j] = a[j+1];	// current value becomes next value
							x = 2;
						}
						size--;	// reducing size of array
					}
				}
	
				System.out.println("The new list after removing : ");

				for(i=0; i<a.length; i++){

					System.out.print(a[i]+" ");	// printing the new list

				}	

				if(!condition){	// for elements not in the list

					System.out.println("ELEMENT NOT FOUND !!!");
					s.nextLine();

				}

			}

			catch(Exception e){	// for wrong inputs

				System.out.println("Wrong input given...check again");		

			}
		}while(x==1);
	}
}
