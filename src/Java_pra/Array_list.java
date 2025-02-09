package Java_pra;

import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		
		ArrayList <String> list = new ArrayList<>();
		
		list.add("Gokul");
		list.add("Rahul");
		list.add("Sagul");
		
	 if (list.contains("Rahul")){
		 System.out.println("Name is present");
	 }
	 
	 else {
		 System.out.println("Name is not present");
		 
	 }

	}
}
