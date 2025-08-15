package javaPractice14082025;

import java.util.Stack;

public class program16 {
    public static void main(String[] args) {
        String input = "()";
        boolean result = check(input);
        if (result) {
            System.out.println("it's balanced parathesis");
        } else {
            System.out.println("not a balanced parathesis");
        }
    }

    static boolean check(String input) {
        char ch[] = input.toCharArray();
        Stack<Character> stack = new Stack<Character>();

        for (char current : ch) { // ✅ loop over input, not stack
            if (current == '(') {
                stack.push(current);
            } else {
                if (current == ')') {
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        char pop = stack.pop();
                        if (pop != '(') { // ✅ only false if mismatch
                            return false;
                        }
                    }
                }
            }
        }

        return stack.isEmpty(); // ✅ true only if all matched
    }
}