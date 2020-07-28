//To remove the duplicates of an array

import java.util.Arrays;

class RemoveDuplicateValue{

	public static void main(String[] args){

		int[] a = {1,3,5,7,7,8,9,5,6,6}; 
		int i,j,k;
		int size = a.length;

		System.out.println("\n ORIGINAL ARRAY : "+Arrays.toString(a)+"\n");

		for(i=0; i<a.length; i++){    // two loops to check each and every element for pairs)

			for(j=i+1; j<size; j++){

				if(a[i] == a[j]){	// checking if two elements are same

					for(k=j;  k<size-1; k++){   // new loop from the duplicate value till size-1(size-1 because we dont have to go till the end)

						a[k] = a[k+1];	// duplicate value becomes its next value

					}
					size--;	// reducing the length by 1 to  remove unnecassary value

				}
			}
		}
		System.out.println("Array after removing duplicate values are  : \n");


		for(i=0; i<size; i++){ 

			System.out.print(a[i]+" ");

		}
		System.out.println("");
	}
}
