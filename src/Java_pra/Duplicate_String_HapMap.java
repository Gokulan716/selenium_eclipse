package Java_pra;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.stream.events.Characters;

public class Duplicate_String_HapMap {
	

	public static void main(String[] args) {
	
		String sr = "anusha";
		
		Map<Character, Integer> countmap = new HashMap<>();	
		char[] Chars= sr.toCharArray();
		for(char c : Chars) {
			
			if (countmap.containsKey(c)) {
				
				countmap.put(c, countmap.get(c)+1);
			}
			else {
				countmap.put(c, 1);
			}

		}
		
		for (Entry<Character, Integer> entry : countmap.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		

	}

}
