package javaPractice14082025;

import java.util.HashMap;

public class program17 {
public static void main(String[] args) {
	// count special character
	String str="!!!!!234j&&y%ot***i#@";
	char ch[]=str.toCharArray();
	HashMap<Character,Integer> freq=new HashMap<Character,Integer>();
	for(char ch1:ch) {
		if(!(ch1>='a' && ch1<='z' || ch1>='A' && ch1<='Z' || ch1>='0'&& ch1<='9')){
			if(freq.containsKey(ch1)) {
				freq.put(ch1, freq.get(ch1)+1);
			}else {
				freq.put(ch1, 1);
			}
		}
	}
		System.out.println(freq);
	}
}

