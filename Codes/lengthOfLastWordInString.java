package Codes;

public class lengthOfLastWordInString {

	public static void main(String[] args) {
 String str="Hello I am Jyoti Gaikwad i am from Solapur maharashtra";
 char ch[]=str.toCharArray();
 int count=0;
 for(int i=0;i<ch.length;i++) {
	 if(ch[i]!=' ') {
		count++; 
	 
 }
	 else if(count>0) {
		System.out.println(count);
		break;
	}
 }
	}

}
