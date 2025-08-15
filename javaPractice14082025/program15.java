	package javaPractice14082025;

import java.util.HashSet;

public class program15 {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps ";
        boolean result = check(s);
        if (result) {
            System.out.println("It's a pangram");
        } else {
            System.out.println("It's not a pangram");
        }
    }

    static boolean check(String ch) {
        ch = ch.toLowerCase();
        char ch1[] = ch.toCharArray();
        HashSet<Character> map = new HashSet<Character>();

        for (char c : ch1) {
            if (Character.isLetter(c)) {
                map.add(c);
            }
        }

        if (map.size() == 26) {
            return true;
        } else {
            return false;
        }
    }
}