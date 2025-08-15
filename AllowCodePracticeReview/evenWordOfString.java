
package AllowCodePracticeReview;



	public class evenWordOfString {

		public static void main(String[] args) {

			String str="Hellow World i am jyoti Mahadev gaikwad i am SDET in Reputed orgnization";
			String s[]=str.split(" ");
			for(String word:s) {
				int length=word.length();
				if(length%2==0) {
					System.out.print("Even words are : ");
					System.out.println(word);

				}
			}
		}}