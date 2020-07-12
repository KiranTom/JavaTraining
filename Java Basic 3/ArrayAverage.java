// to calculate the average of values in the array

class ArrayAverage{

	public static void main(String[] args){

		int sum = 0,i,average;

		int[] a = {2,4,6}; // my array values
		
		for(i=0; i<3; i++){	// running the loop only 3 times(3 elements)

			sum = sum + a[i];	// sum

		}
		
		average = sum / a.length;	// average
		System.out.println("AVERAGE IS : "+average);
	}
}
