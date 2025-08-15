package javaPractice14082025;

public class program12 {
public static void main(String[] args) {
	// Reverse vowels only
	String str="jyoti";
	str=str.toLowerCase();
	String vowel="aieou";
	char ch[]=str.toCharArray();
	int Left=0;
	int Right=ch.length-1;
	while(Left<Right) {
		if(vowel.indexOf(ch[Left])==-1){
			Left++;
		}
		if(vowel.indexOf(ch[Right])==-1) {
			Right--;
		}
		else {
			char temp=ch[Left];
			ch[Left]=ch[Right];
			ch[Right]=ch[Left];
			Left++;
			Right--;
		}
	}
	System.out.println(new String(ch));
}
}
