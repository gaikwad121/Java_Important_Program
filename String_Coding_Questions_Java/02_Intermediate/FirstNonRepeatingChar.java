/*
Problem: Find the first non-repeating character in a string
Input: "swiss"
Output: "w"
*/
import java.util.LinkedHashMap;
import java.util.Map;
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "swiss";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                System.out.println(c);
                break;
            }
        }
    }
}
