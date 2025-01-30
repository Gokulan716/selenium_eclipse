package Java_pra;

import java.util.Arrays;

public class Reverse_Array {

	public static void main(String[] args) {
		
		int a[]= {10, 20, 30, 40, 50, 60};
		
		
		 
		
		 
		 for (int l=0, r= a.length-1; l<r; l++, r--){
			 
			 int temp= a[l];
			 a[l] = a[r];
			 a[r] = temp;
			 
		 }		
		 
		 System.out.println(Arrays.toString(a));
	}

}
