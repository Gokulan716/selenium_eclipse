package Java_pra;

import java.util.HashMap;
import java.util.Map;

public class Repeated_word_sentence {

    public static void main(String[] args) {
        String sen = "Anusha";
        sen = sen.toLowerCase();

        // Using a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count the occurrence of each character
        for (char c : sen.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        // Print characters that appear more than once
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
    }
}