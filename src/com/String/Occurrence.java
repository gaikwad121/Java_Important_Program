package com.String;

import java.util.HashMap;
import java.util.Map;

public class Occurrence {
    public static void main(String[] args) {
        String str = "Altimetrik";
        str = str.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();
        char[] ch = str.toCharArray();

        // Count character occurrences
        for (char ch1 : ch) {
            map.put(ch1, map.getOrDefault(ch1, 0) + 1);
        }

        // Print all character frequencies
        for (char ch3 : map.keySet()) {
            System.out.println("char " + ch3 + " | " + map.get(ch3));
        }

        // Find max occurrence
        int max = 0;
        for (int count : map.values()) {
            if (count > max) {
                max = count;
            }
        }

        // Print character(s) with max occurrence
        System.out.println("\nCharacter(s) with maximum occurrence (" + max + " times):");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey());
            }
        }
    }
}
