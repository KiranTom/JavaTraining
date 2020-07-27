// To find the common element between two arrays (Strings)

import java.util.Arrays;

class CommonStringElement{

        public static void main(String[] args){

                int i,j;

                String[] a = {"hi","bye","ok","hello","wow"};
                String[] b = {"one","bye","three","hello","five"};
                String[] c = new String[4];	// array to store the common values

                System.out.println(" First Array :"+Arrays.toString(a)+"");
                System.out.println(" Second Array :"+Arrays.toString(b)+"\n");

                for(i=0; i<= a.length-1; i++){

                        for(j=0; j<b.length-1; j++){

                                if(a[i] == b[j]){

                                        c[i] = a[i];     

                                }
                        }
                }

                System.out.println("the common elements are: \n");

                for(i=0; i<c.length; i++){

                        if(c[i] != null ){ // printing the common values by loop without printing the null

                                System.out.print(c[i]+" ");
                        }

                }
                System.out.println("\n");
        }
}

