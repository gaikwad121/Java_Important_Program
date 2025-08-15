package javaPractice14082025;

public class program14 {
public static void main(String[] args) {
	String s="The quick brown fox jumps over the lazy dog";
			//" Hi i am Jyoti mahadev gaikwad i am a SDET i have a four years experience as software engineer i am living in solapur maharashtra";
	s=s.toLowerCase();
	char ch[]=s.toCharArray();
	boolean result=check(s);
	if(result) {
		System.out.println("It's palingrom");
	}else {
		System.out.println("It's not  palingrom");

	}
}
	public static boolean check(String ch) {
		ch=ch.toLowerCase();
	if(ch.length()<26) {
	return false;
		
	}
	for(char i='a';i<='z';i++) {
		//System.out.println(i);
		if(ch.indexOf(i)<0) {
			return false;
		}
	}
	return true;
}
}


