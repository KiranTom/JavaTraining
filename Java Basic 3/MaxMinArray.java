// To find the maximum and minimum value in the array

import java.util.Arrays;

class MaxMinArray{

	public static void main(String[] args){

		int[] a = {9,3,2,6,4,5};
		int i, max = a[0], min = a[5];

		System.out.println("ARRAY IS : "+Arrays.toString(a));

		for(i=0; i<a.length-1; i++){

			if(a[i] > max){

				max = a[i];	// new max value (if any)

			}
			if(a[i] < min){

				min = a[i];	// new min value (if any)

			}
		}
		System.out.println("The maximum value in array is : "+max+"");
		System.out.println("The minimum value in array is : "+min+"");


	}

}
