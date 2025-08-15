package Com.Practice;

public class LengthOfLastWordInString {

	public static void main(String[] args) {
String s="Hi i am jyoti Mahadev Gaikwad i am from Solapur";
int count=0;
char ch[]=s.toCharArray();
for(int i=ch.length-1;i>=0;i--) {
	if(ch[i]!=' ') {
		count++;
	}
	else 
		if(count>0) {
			System.out.println(count);
			break;
		}
	}
}
		
	}


