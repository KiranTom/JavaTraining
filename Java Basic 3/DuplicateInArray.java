//To find the duplicates of array

import java.util.Arrays;

class DuplicateInArray{

	public static void main(String[] args){

		int[] a = {1,3,5,7,7,8,9,5,6};
		int[] dup =  new int[7];	//array to copy duplicate values
		int i,j;

		System.out.println("\n ORIGINAL ARRAY : "+Arrays.toString(a)+"\n");

		for(i=0; i<a.length-1; i++){	// two loops to check each and every element for pairs

			for(j=i+1; j<a.length; j++){

				if(a[i] == a[j]){

					dup[i] = a[i];	// assigning the dup value to the array

				}
			}	
		}
		System.out.println("Duplicate values in the array : ");

		for(i=0; i<dup.length-1; i++){ // for printing the new array which contains the duplicate

			if(dup[i] != 0){

				System.out.print(dup[i]+" ");

			}
		}
	}
}

