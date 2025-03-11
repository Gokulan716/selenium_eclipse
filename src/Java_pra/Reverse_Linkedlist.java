package Java_pra;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Reverse_Linkedlist {

	
	public static void main(String[] args) {
		
		List<Integer> numbers = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50)); 
		
		LinkedList<Integer> num1= new LinkedList<>();
		
	   for (int num: numbers) {
		   num1.addFirst(num);
	   }
	
		
	   System.out.println(numbers);
	   System.out.println(num1);

	}

}
