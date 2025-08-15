package javaPractice14082025;

public class program1 {
public static void main(String[] args) {
	// Length of a LastWord in string
	int count=0;
	String s="Jyoti Mahadev Gaikwad Pune maharashtra";
	char ch[]=s.toCharArray();
	for(int i=ch.length-1;i>=0;i--) {
		if(ch[i]!=' ') {
			count++;
		}
		else{
			if(count>0) {
		}
			System.out.println(count);
			break;
		}
	}
	
}
}
