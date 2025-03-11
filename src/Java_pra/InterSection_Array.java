package Java_pra;

import java.util.HashSet;

public class InterSection_Array {

	public static void main(String[] args) {
		
		
		int arr1[]= {1,2,3 ,4,5};
		int arr2[]= {3, 4,5,6,7};
		
		HashSet<Integer> ls = new HashSet<>();
		
		for(int a :arr1) {
			ls.add(a);
		}
		
		for(int a :arr2) {
			if (ls.contains(a)) {
				System.out.print(a);
			}
			
		}

	}

}
