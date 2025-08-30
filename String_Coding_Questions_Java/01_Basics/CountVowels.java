/*
Problem: Count vowels in a string
Input: "education"
Output: 5
*/
public class CountVowels {
    public static void main(String[] args) {
        String str = "education";
        int count = 0;
        for (char c : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) count++;
        }
        System.out.println(count);
    }
}
