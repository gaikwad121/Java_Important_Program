package codesOfString;

public class LegthOfLast {
public static void main(String[] args) {
	String Name="Jyoti Mahadev Gaikwad";
	lengthOfLastWord(Name);
}
static void lengthOfLastWord(String Name) {
	int count=0;
	char ch[]=Name.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
		//System.out.println(ch[i]);
		if(ch[i]!=' ') {
			count++;
		}
	
		else if(count>0) {
		System.out.println(count);
		break;
	}
}
}}
