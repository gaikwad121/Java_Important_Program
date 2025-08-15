package AllowCodePracticeReview;

public class printOddWordInAString {

	public static void main(String[] args) {
		String str="Hellow World i am jyoti Mahadev gaikwad i am SDET in Reputed orgnization";
 String s[]=str.split(" ");
 for(String words:s) {
	 int length=words.length();
	 if(length%2!=0) {
		 System.out.println(words);
	 }
 }
	}

}
