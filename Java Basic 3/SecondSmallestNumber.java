// To find the second smallest number in  array

import java.util.Arrays;

class SecondSmallestNumber{

	public static void main(String[] args){

		int[] a = {2,4,7,9,5};
		int first = Integer.MAX_VALUE; 
		int second = Integer.MAX_VALUE;
		int i;

		System.out.println("MY ARRAY : "+Arrays.toString(a)+"\n");

		if(a.length < 2){

			System.out.println("numbers are less ");

		}

		else{

			for(i=0; i<=a.length-1; i++){

				if(a[i] < first){       // for first and second

					second = first;
					first = a[i];
				}

				else  if((a[i] < second) && (a[i] != first)){  // for values smaller than second

					second = a[i];

				}
			}

			System.out.println("The second smallest number is : "+second);
		}
	}
}

