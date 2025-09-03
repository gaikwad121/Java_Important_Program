package codesOfString;

public class evenWordOfString {
public static void main(String[] args) {
	String name="Jyoti Mahadev Gaikwad i am from solapur maharashtra";
	evenWord(name);
}
static void evenWord(String name) {
	String s[]=name.split(" ");
	for(String word:s) {
		int length=word.length();
		if(length%2==0) {
			System.out.print("Even Length Word are  : ");
			System.out.println(word);
		}
	
	
	}
	
}
}
