package com.String_Program;

public class PrintUniqueChar {
    public static void main(String[] args) {
        String str = "gaikwad";
        StringBuilder sb = new StringBuilder();
        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < ch.length; j++) {
                if (i != j && ch[i] == ch[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                sb.append(ch[i]);
            }
        }

        System.out.println("Unique characters: " + sb);
    }
}