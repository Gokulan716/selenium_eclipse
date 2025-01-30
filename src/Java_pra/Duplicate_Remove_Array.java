package Java_pra;

import java.util.Arrays;

public class Duplicate_Remove_Array {

	public static void main(String[] args) {
		
		int a[]= {10, 50, 30, 30, 40, 50, 60};
		
	    Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		for (int i=0; i< a.length-1; i++ ) {
			  
			
			if (a[i]==a[i+1])
			{
				System.out.println("Duplicate ="+ a[i]);
			}
				
		}
		
	}

}
