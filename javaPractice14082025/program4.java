package javaPractice14082025;

public class program4 {
public static void main(String[] args) {
	// odd word in String
	String s=" Hi i am Jyoti mahadev gaikwad i am a SDET i have a four years experience as software engineer i am living in solapur maharashtra";
  String str[]=s.split(" ");
  for(String word:str) {
	  int length=word.length();
	  if(length%2!=0) {
		  System.out.println(word);
	  }
  }
}
}
