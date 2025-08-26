package com.Array;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateNum {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,5,6,6,3,1,8,9};
   Set<Integer>set=new LinkedHashSet<Integer>();
   for(int ar:arr) {
	   set.add(ar);
   }
   for(int a:set) {
	   System.out.println(a);
   }
}
}
