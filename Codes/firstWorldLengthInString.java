package Codes;

public class firstWorldLengthInString {

	public static void main(String[] args) {
String str="I am jyoti Mahadev Gaikwad";
int count=0;
char ch[]=str.toCharArray();
for(int i=ch.length-1;i>=0;i--) {
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
