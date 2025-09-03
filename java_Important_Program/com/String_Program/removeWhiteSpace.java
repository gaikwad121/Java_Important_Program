package com.String_Program;

public class removeWhiteSpace {
public static void main(String[] args) {
	String str="  Jyoti Gaikwad  ";
	String s=str.replaceAll("\\s+", "");
	String s1=str.trim();
	//System.out.println(str);
	System.out.println(s1);
	System.out.println(s);
}
}
