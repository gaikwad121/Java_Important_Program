package com.Array;

public class countVowelNConsonant {
public static void main(String[] args) {
	int countVowels=0;
	int countConsonant=0;
	String str="jyoti gaikwad";
	for(int i=0;i<str.length();i++) {
	char ch3=str.charAt(i);
	if(ch3=='A' || ch3=='I' || ch3=='O' || ch3=='U' || ch3=='E' || ch3=='a' || ch3=='i' || ch3=='e' || ch3=='o' || ch3=='u' && ch3!=' ') {
		countVowels++;
	}
	else { 
		if(ch3!=' ') {
		countConsonant++;
	}
}
	
	}System.out.println("Consonant" +" "+countConsonant);
	System.out.println("Vowels"+" "+countVowels);
}
}