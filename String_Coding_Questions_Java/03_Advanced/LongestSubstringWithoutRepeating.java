/*
Problem: Longest substring without repeating characters
Input: "abcabcbb"
Output: 3 ("abc")
*/
import java.util.HashSet;
public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int maxLen = 0;
        int i = 0, j = 0;
        HashSet<Character> set = new HashSet<>();
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                maxLen = Math.max(maxLen, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }
        System.out.println(maxLen);
    }
}
