package Java_pra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse_Array_list {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50)); 
		
		int size = numbers.size();
		
		
		for(int i=0; i < size/2; i++) {
			
			int temp = numbers.get(i);
			
			numbers.set(i, numbers.get(size-i-1));
			numbers.set(size-i-1, temp);
		}
		
		System.out.println(numbers);

	}

}
