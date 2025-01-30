package Java_pra;

import java.util.Arrays;

public class Second_Largest_Array {

	public static void main(String[] args) {
		int a[]= {10, 20, 40, 2, 90, 50};
		
		 Arrays.sort(a);
		 
		 System.out.println(Arrays.toString(a));
		 
		 System.out.println(a[a.length-2]);
	}
}
