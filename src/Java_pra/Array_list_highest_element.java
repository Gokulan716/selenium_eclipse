package Java_pra;

import java.util.ArrayList;

public class Array_list_highest_element {

	public static void main(String[] args) {
			
		ArrayList <Integer>  list = new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(160);
		list.add(506);
		list.add(177);
		list.add(99);
		list.add(200);
	
		System.out.println(list);
		
		int max = list.get(0);
		
		for (int i=1; i< list.size(); i++) {
			
			if (list.get(i)> max ) {
				max = list.get(i);
			}
		}
		
		System.out.println("Max num = "+max);

	}

}
