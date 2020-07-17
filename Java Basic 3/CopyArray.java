// To copy array elements to another array by iteration

import java.util.Arrays;

class CopyArray{

	public static void main(String [] args){

		int i;

		int[] a = {1,3,5,7,9};	// original array
		int[] b = new int[5];	// new array
	
		for(i=0; i<a.length; i++){	// copying values from old to new array

			b[i] = a[i];

		}
		System.out.println("Old array : "+Arrays.toString(a));
		System.out.println("New array : "+Arrays.toString(b));

	}
}
