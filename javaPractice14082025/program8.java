package javaPractice14082025;

import java.util.HashMap;

public class program8 {
public static void main(String[] args) {
	// Frequency of Characters  
	String s=" Hi i am Jyoti mahadev gaikwad i am a SDET i have a 4 years experience as software engineer i am living in solapur maharashtra";
	char[] ch=s.toCharArray();

		HashMap<Character,Integer>frequency=new HashMap<Character,Integer>();
		for(char c:ch) {
			frequency.put(c, frequency.getOrDefault(c, 0)+1);
	}
		for(char ch1:frequency.keySet()) {
			System.out.println(ch1+"  "+frequency.get(ch1));
		}
}
}
