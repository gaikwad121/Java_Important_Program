package codesOfString;

public class removeDuplicateCharFromString2 {
public static void main(String[] args) {
	String name="ababccdd";
	removeString(name);
}
static void removeString(String name) {
	name=name.toLowerCase();
	StringBuilder sb=new StringBuilder();
	char ch[]=name.toCharArray();
	for(int i=0;i<ch.length;i++) {
		boolean repeated=false;
	for(int j=i+1;j<ch.length;j++) {
		if(ch[i]==ch[j]) {
		repeated=true;
		break;
		}
	}
	if(!repeated) {
		sb.append(ch[i]);
	}
	}
	System.out.println(sb);
	}
	
}

