package AllowCodePracticeReview;

public class lengthOfFirstWordInString {

	public static void main(String[] args) {
 String str="Jyoti Mahadev Gaikwad";
 int count=0;
 char ch[]=str.toCharArray();
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
