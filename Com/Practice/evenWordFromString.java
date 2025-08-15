package Com.Practice;

public class evenWordFromString {

	public static void main(String[] args) {
  String s="I am from Solapur maharashtra India";
  String str[]=s.split(" ");
  for(String s2: str) {
	  int length=s2.length();
	  if(length%2==0) {
		  System.out.print("even word :"+ "  "+ s2);
	  
		  System.out.println();
	  }
	  else {
		  if(length%2!=0) {
			  System.out.print("odd word : "+ " "+ s2);
		  }
			  System.out.println();
			  
		  }
	  }
  }
	}


