package Java_pra;
 import java.util.*;

public class Duplicate_removal {

	public static void main(String[] args) {
	
		int arr[] = { 1, 9, 4, 5, 5, 7, 8 , 9, 20, 20};

		
    Set<Integer> setlist = new HashSet<>();
		 
		for (int a: arr) {
			setlist.add(a);
		}
		
System.out.println(setlist);
	}

}
