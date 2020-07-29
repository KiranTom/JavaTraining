// To find the second largest number in  array

import java.util.Arrays;

class SecondLargestNumber{

	public static void main(String[] args){

		int[] a = {2,4,7,9,5};
		int first = Integer.MIN_VALUE;	// smallest possible value
		int second = Integer.MIN_VALUE;	
		int i;

		System.out.println("MY ARRAY : "+Arrays.toString(a)+"\n");

		for(i=0; i<=a.length-1; i++){	

			if(a[i] > first){	// for first and second

				second = first;
				first = a[i];	
			}

			else if(a[i] > second){	// for values greater than second

				second = a[i];

			}
		}

		System.out.println("The second largest number is : "+second);
	}
}
