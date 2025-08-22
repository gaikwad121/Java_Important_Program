package codesOfString;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicateCharFromString {
public static void main(String[] args) {
	String n="gaikwad";
	RemoveDuplicate(n);
}
static String RemoveDuplicate(String n) {
	StringBuilder sb=new StringBuilder();
	n=n.toLowerCase();
	char ch[]=n.toCharArray();
	LinkedHashSet<Character>set=new LinkedHashSet<Character>();
	for(char ch1:ch) {
		set.add(ch1);
	}
	for(char ch2:set) {
		sb.append(ch2);
	}
	System.out.println(sb);
	
	return sb.toString();
	
}
}
