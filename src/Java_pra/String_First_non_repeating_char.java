package Java_pra;

import java.util.HashMap;

import com.google.common.collect.Interner;

//Hash map Occurance	
public class String_First_non_repeating_char {

	public static void main(String[] args) {
	
		String str = "Anusha";
	
		str = str.toLowerCase();
		
		
		HashMap<Character, Integer> chars = new HashMap<>();
		
		
		
		for ( int i=0; i< str.length(); i++) {
			   char c =str.charAt(i);
			   
			   chars.put(c, chars.getOrDefault(c, 0)+1);
		}
		
		for ( int i=0; i< str.length(); i++) {
			
			if(chars.get(str.charAt(i))==1) {
                System.out.print(str.charAt(i));
                return;
			}
		}
		
		System.out.print("Not Found");

	}

}
