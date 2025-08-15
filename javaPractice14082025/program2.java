package javaPractice14082025;

public class program2 {

	public static void main(String[] args) {
		int count=0;
		
		// length of first word
		String s=" Hi i am Jyoti mahadev gaikwad i am a SDET i have a 4 years experience as software engineer i am living in solapur maharashtra";
          char ch[]=s.toCharArray();
          for(int i=0;i<ch.length;i++) {
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
