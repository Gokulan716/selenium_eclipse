package Java_pra;

import java.util.Arrays;
import java.util.LinkedList;

public class Linked_list_middle_element {

	public static void main(String[] args) {		
		
		LinkedList<String> Animals = new LinkedList<>(Arrays.asList("Dog", "Cat", "Goat","Cow","Tiger","Monkey")); 
		
		int num = Animals.size()/2;
		
		if ( Animals.size() %2==0) {
			
			System.out.println(Animals.get(num-1)+","+Animals.get(num));
			
		}
		
		else {
			
			System.out.println(Animals.get(num));
			
		}	

	}

}
