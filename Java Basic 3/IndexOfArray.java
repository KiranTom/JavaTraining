// To find the index of an array element
import java.util.Scanner;

class IndexOfArray{

	public static void main(String[] args){

		Scanner s = new Scanner(System.in);

		int[] array = {5,3,8,9,2,6};
		int i,num;
		int x = 1;
		boolean condition = false;
		int k=0;

		do{

			try{

				System.out.println("SELECT ANY VALUE FROM THIS ARRAY : 5,3,8,9,2,6"); //My array value

				num = s.nextInt();

				for(i=0; i<array.length; i++){

					if(array[i] == num){
						
						k = i;
						condition = true;
						x = 2;
					}		
				}

				if(condition){

					System.out.println("The index of "+num+" is "+k);
		
					}

				if(!condition){

					System.out.println("NOT IN THE ARRAY LIST...TAKE FROM THE LIST!!!");
					s.nextLine();


				}

			}

			catch(Exception e){

				System.out.println("Cannot do that ... Try again");
				s.nextLine();

			}

		}while(x==1);
	}
}
