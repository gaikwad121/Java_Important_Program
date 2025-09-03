package com.String_Program;

public class RemoveDuplicateInString {
    public static void main(String[] args) {
        String str = "Gaikwad";
        StringBuilder sb = new StringBuilder();
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            boolean repeated = false; // reset for each character

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    repeated = true;
                    break;
                }
            }

            if (!repeated) {
                sb.append(ch[i]);
            }
        }

        System.out.println(sb);
    }
}
