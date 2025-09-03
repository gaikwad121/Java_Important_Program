package com.String_Program;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateInString2 {
public static void main(String[] args) {
	String str="nanda";
	char ch[]=str.toCharArray();
	Set <Character>set=new LinkedHashSet<Character>();
	for(char ch2:ch) {
		set.add(ch2);
	}
	for(char c:set) {
		System.out.println(c);
	}

}
}
