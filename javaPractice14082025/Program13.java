package javaPractice14082025;

import java.util.Arrays;

public class Program13 {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder();

	// Replace Vowels with x
	String str="jyoti";
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++) {
	char ch1=ch[i];
	if(ch1=='a' || ch1=='i' || ch1=='e' || ch1=='o' || ch1=='u') {
		sb.append('X');
	}else {
		sb.append(ch1);
	}
}
	System.out.println(sb.toString());

}}
