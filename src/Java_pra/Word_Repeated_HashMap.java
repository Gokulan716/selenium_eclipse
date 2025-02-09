package Java_pra;

import java.util.HashMap;
import java.util.Map;

public class Word_Repeated_HashMap {

	public static void main(String[] args) {
		
		String sen= "It is true for all that that that that that that that refers to is not the same that that that that refers to";
		
		Map<String, Integer> countword = new HashMap<>();
		
		String lowercase = sen.toLowerCase();
		
		String[] words = lowercase.split(" ");
		
		for (String word : words) {	
	
			if (countword.containsKey(word)) {
				countword.put(word, countword.get(word)+1);
			}
			
			else {
				countword.put(word, 1);
			}
			
		}
		
		for (Map.Entry<String, Integer> entry :countword.entrySet() ) {
			System.out.println(entry.getKey()+"="+ entry.getValue());
		}
		
		
		
		
// Hash map Occurance	
// Hash Set Duplicate values
		
		
		

	}

}
