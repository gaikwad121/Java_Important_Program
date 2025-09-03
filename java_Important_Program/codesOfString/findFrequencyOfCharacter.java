package codesOfString;

import java.util.HashMap;

public class findFrequencyOfCharacter {
	public static void main(String[] args) {
		String name="Gaikwad";
		freqOfChar(name);
		
	}
static void freqOfChar(String name) {
	name=name.toLowerCase();
	char ch[]=name.toCharArray();
	HashMap<Character ,Integer> map=new HashMap<Character,Integer>();
	for(char ch1:ch) {
		map.put(ch1, map.getOrDefault(ch1, 0)+1);
	}
	for(char ch2:map.keySet()) {
		System.out.println(ch2+" "+map.get(ch2));
	}
}
}
