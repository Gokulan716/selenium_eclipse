package Java_pra;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class Linked_list_Duplicate_removal {

	public static void main(String[] args) {
		
	
		
		LinkedList<String> Animals = new LinkedList<>(Arrays.asList("Dog", "Cat", "Goat","Cow","Dog")); 
		
		HashSet<String> list = new HashSet<>(Animals);
		
        System.out.println(list);
		

	}

}
