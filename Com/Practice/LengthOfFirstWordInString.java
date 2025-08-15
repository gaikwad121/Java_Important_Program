package Com.Practice;

public class LengthOfFirstWordInString {

	public static void main(String[] args) {
 String s="Jyoti Mahadev Gaikwad";
 int count=0;
 char ch[]=s.toCharArray();
 for(int i=0;i<=ch.length-1;i++) {
	 if(ch[i]!=' ') {
		 count++;
	 }
	 else {
		 if(count>0) {
			 System.out.println(count);
			 break;
		 }
	 }
 }
	}

}
