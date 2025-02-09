package Java_pra;

import java.util.ArrayList;

public class Array_list_remove_even {

	public static void main(String[] args) {
	ArrayList <Integer>  list = new ArrayList<>();
		
		list.add(10);
		list.add(50);
		list.add(160);
		list.add(506);
		list.add(177);
		list.add(99);
		list.add(200);
		
		
    for (int i=0; i< list.size(); i++) {
			
    	   if(list.get(i) % 2 ==0) {
    		   
    		   list.remove(i);
	
			}
    	   else {
    		   
    		  System.out.println(" Odd Number: "+ list.get(i));
    	   }
		}
    
    
    

	}

}
