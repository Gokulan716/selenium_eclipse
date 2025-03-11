package Java_pra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_list_even_remove {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50)); 
		
		
		ArrayList<Integer> ls2 = new ArrayList<>();
		
		
		for(int num: numbers) {
			if(num % 2!=0) {
				ls2.add(num);
			}
		}
		
		
		
		System.out.println(ls2);
	
		

	}

}
