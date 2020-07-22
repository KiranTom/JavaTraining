// To reverse values in an array

import java.util.Arrays;

class ReverseArray{

	public static void main(String[] args){
	
		int[] a = {1,5,8,3,7};
		
		System.out.println("ORIGINAL ARRAY : "+Arrays.toString(a)+"\n");
		System.out.println("REVERSED ARRAY : ");

		for(int i = a.length-1; i>=0; i--){	//loop from end to beginning
		
			System.out.print(a[i]+" ");	//printing normally but according to loop

		}
	}
}
