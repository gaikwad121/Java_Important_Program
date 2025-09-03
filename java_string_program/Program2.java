import java.util.LinkedHashMap;
import java.util.Map;

public class Program2 {
    public static void main(String[] args) {
        String str = "gaikwad";

        firstNonRepeatingChar(str);
        System.out.println("All non-repeating characters:");
        allNonRepeatingChars(str);
    }

    // Print the first non-repeating character
    static void firstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        // Count frequency of each character
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Find the first character with count 1
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                return; // stop after the first
            }
        }
    }

    // Print all non-repeating characters
    static void allNonRepeatingChars(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();
    }
}
