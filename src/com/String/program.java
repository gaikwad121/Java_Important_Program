package com.String;

import java.util.HashMap;
import java.util.Map;

public class program {
// count frquency of each character
	public static void main(String[] args) {
		String str="madam";
		charOccurnace(str);
	}
	public static void charOccurnace(String str) {
	char ch[]=str.toCharArray();
	Map<Character,Integer> map=new HashMap<Character,Integer>();
	for(char ch1:ch) {
		map.put(ch1, map.getOrDefault(ch1, 0)+1);
	}
	for(char ch3:map.keySet()) {
		System.out.println("the char are : "+ch3+" | "+"the occurance are :"+map.get(ch3));
	}
	}
}
