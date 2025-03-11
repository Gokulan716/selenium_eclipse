package Java_pra;

import java.util.HashSet;

public class HashSet_Duplicate_remove {

	public static void main(String[] args) {
		
		int arr[]= {10, 20,90,20, 50, 50, 30, 30};
		
		
		HashSet<Integer> setls = new HashSet<>();
		
		for (int a: arr) {
			
			setls.add(a);
			
		}
		
		System.out.println(setls);

	}

}
