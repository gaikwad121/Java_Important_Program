/*
Problem: Reverse a string in Java
Input: "hello"
Output: "olleh"
*/
public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse().toString());
    }
}
