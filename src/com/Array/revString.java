package com.Array;

public class revString {

	public static void main(String[] args) {
 String str="madam";
 System.out.println(rev(str));
 String s=rev(str);
 if(str.equals(s)) {
	 System.out.println("palindrome");
 }else {
	 System.out.println("not palindrome");
 }
	}
	public static  String rev(String str) {
	String rev="";
	for(int i=str.length()-1;i>=0;i--) {
	rev=rev+str.charAt(i);
	}
		return rev;
	}

}
