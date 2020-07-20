// To insert an element at specific position in array

import java.util.Scanner;
import java.util.Arrays;

class InsertValueAtPosition{

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		int i,pos,nu
		int[] a	= {1,3,7,9};
		int size = a.length-1;	// assigning the total number of elements in the array to "size"

		System.out.println("Current array : "+Arrays.toString(a));

		System.out.println("Enter the position to add the element : ");
		pos = s.nextInt();

		System.out.println("Enter the element : ");	
		num = s.nextInt();

		for(i=size; i>pos; i--){

			a[i] = a[i-1];		// current element becomes the previous element (until it reaches the position you gave) 

		}

		a[pos] = num;
		size++;

		System.out.println("New array : ");

		for(i=0; i<size; i++){	// printing

			System.out.print(a[i]+" ");	

		}						
	}	
}
