package Java_pra;

import java.util.ArrayList;
import java.util.HashSet;

public class Remove_Dupliacte_values_From_ArrayList {
	
	//Array list it has duplicate values want to remove to duplicate values

	public static void main(String[] args) {
		
		ArrayList <Integer>  list = new ArrayList<>();
		list.add(10);
		list.add(50);
		list.add(10);
		list.add(20);
		list.add(20);
		list.add(40);
		list.add(60);
		
		HashSet<Integer> withoutduplicate = new HashSet<>(list);

		System.out.println(withoutduplicate);
	}

}
