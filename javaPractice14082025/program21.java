package javaPractice14082025;

import java.util.LinkedHashSet;

public class program21 {
public static void main(String[] args) {
	String str="abaabbccdd";
	char ch[]=str.toCharArray();
	LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	StringBuilder sb=new StringBuilder();
	for(char ch1: ch) {
		set.add(ch1);
	}
	for(char ch2:set) {
		
	
	sb.append(ch2);
}
System.out.println(sb);
}
}