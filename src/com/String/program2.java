package com.String;

public class program2 {
public static void main(String[] args) {
	String str="gaikwad";
	nonRpeatingChar(str);
}

static void nonRpeatingChar(String str) {
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++) {
		boolean repeated=false;
	for(int j=0;j<ch.length;j++) {
		if(i!=j && ch[i]==ch[j]) {
			repeated=true;
			break;
		}
	}
		if(!repeated) {
			System.out.println(ch[i]);
		}
	}
	}
	
}
