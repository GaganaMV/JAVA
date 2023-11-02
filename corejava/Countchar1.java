package corejava;

import java.util.HashMap;
import java.util.Map;

public class Countchar1 {

	public static Map<Character, Integer> countChars(char[] arr) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Iterate through the character array
        for (char ch : arr) {
            // Check if the character is already present in the map
            if (charCountMap.containsKey(ch)) {
                // If present, increment the count by 1
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                // If not present, add it to the map with count 1
                charCountMap.put(ch, 1);
            }
        }
        
        return charCountMap;
    }
    
    public static void main(String[] args) {
        char[] arr = {'a', 'f', 'c', 'd', 'a', 'c'};
        Map<Character, Integer> charCounts = countChars(arr);
        
        // Print the character counts
        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }


}
