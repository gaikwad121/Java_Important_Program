package javaPractice14082025;

import java.util.Arrays;

public class program11 {

	public static void main(String[] args) {
   String str="jy12oti4";
   char ch[]=str.toCharArray();
  int Left=0;
  int right=ch.length-1;
  while(Left<right) {
	  if(!Character.isLetter(ch[Left])) {
		  Left++;
	  }
	  else  if(!Character.isLetter(ch[right])) {
		  right--;
		  
	  }
	  else {
		  char temp=ch[Left];
		  ch[Left]=ch[right];
		  ch[right]=temp;
		  Left++;
		  right--;
	  }
  }
	  System.out.println(Arrays.toString(ch));
   }
	}

