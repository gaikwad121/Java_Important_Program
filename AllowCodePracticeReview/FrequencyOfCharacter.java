package AllowCodePracticeReview;

import java.util.HashMap;

public class FrequencyOfCharacter {
	public static void main(String[] args) {
		
	
String str="madam";
char ch[]=str.toCharArray();
//for(int i=0;i<ch.length;i++) {
	HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	for(char c:ch) {
	map.put(c, map.getOrDefault(c, 0)+1);
}
	for(char ch1 : map.keySet()) {
		System.out.println(ch1 +" "+map.get(ch1));
	}
	}
}
