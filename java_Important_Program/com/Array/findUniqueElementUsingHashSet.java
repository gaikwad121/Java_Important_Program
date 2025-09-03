package com.Array;

/*import java.util.HashSet;

public class findUniqueElementUsingHashSet {
public static void main(String[] args) {
	 int arr[]= {2,34,2,6,78,6,6,6,90,34,7,23,24};
HashSet<Integer> map=new HashSet<Integer>();
for(int a:arr) {
map.add(a);
}
for(int b:map) {
	System.out.println(b);
}
}}
*/
import java.util.HashMap;

public class findUniqueElementUsingHashSet {
    public static void main(String[] args) {
        int[] arr = {2, 34, 2, 6, 78, 6, 6, 90, 34, 7, 23, 24};

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Count frequency
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Print elements that appear only once
        for (int num : arr) {
            if (freqMap.get(num) == 1) {
                System.out.println(num);
            }
        }
    }
}