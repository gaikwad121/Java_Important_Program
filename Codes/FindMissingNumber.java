package base;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindMissingNumber {
	public static void main(String[] args) {
	        int arr[] = {2,3,3,3,4,4,5,7,8,9,1,1,1,9,9};

	        Set<Integer> set = new HashSet<>();
	        for (int num : arr) {
	            set.add(num);
	        }

	        int min = Collections.min(set);
	        int max = Collections.max(set);

	        for (int i = min; i <= max; i++) {
	            if (!set.contains(i)) {
	                System.out.println("Missing number: " + i);
	            }
	        }
	    }
	}
