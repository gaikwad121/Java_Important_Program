package com.Array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class findDuplicateInString {
public static void main(String[] args) {
	String str="gaikwad";
	char ch[]=str.toCharArray();
	Set<Character> set=new LinkedHashSet<Character>();
	for(char ch2:ch) {
	set.add(ch2);
}
	for(char ch3:set) {
		System.out.println(ch3);
	}
}
}