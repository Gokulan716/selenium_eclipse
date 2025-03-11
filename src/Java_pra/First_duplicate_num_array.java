package Java_pra;

import java.util.HashSet;

public class First_duplicate_num_array {

	public static void main(String[] args) {
		// Find the first repeated num in array
		
		int arr[] = { 1, 4,  5, 10, 5, 7, 8 , 9, 20};
		
		 
		
		HashSet<Integer> ls = new HashSet<>();
		
		for (int a: arr) {
			
			if (!ls.add(a)) {
				System.out.println(a);
				return;
			}
		
		
		}
		
		
		
		}
	}
