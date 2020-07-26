// To find the common element between two arrays

import java.util.Arrays;

class CommonElement{

	public static void main(String[] args){

		int i,j;

		int[] a = {1,3,5,7,9};	
		int[] b = {2,4,5,6,8};
		int[] c = new int[4];

		System.out.println(" First Array :"+Arrays.toString(a)+"\n");
		System.out.println(" Second Array :"+Arrays.toString(b)+"\n");

		for(i=0; i<= a.length-1; i++){

			for(j=0; j<b.length-1; j++){

				if(a[i] == b[j]){

					c[i] = a[i];	// comparing and assigning common terms using loops	

				}
			}		
		}

		System.out.println("the common elements are: \n");		

		for(i=0; i<c.length; i++){

			if(c[i] != 0 ){	// printing the common values by loop without printing the 0

				System.out.print(c[i]+" ");
			}

		}
		System.out.println("\n");
	}
}
