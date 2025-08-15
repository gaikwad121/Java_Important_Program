package Codes;

public class palindromeNumber {

	public static void main(String[] args) {
int num=12321;
int temp=num;
int rev=0;
while(num!=0) {
	rev=rev*10+num%10;
	num/=10;
}
System.out.println(rev);
if(rev==temp) {
	System.out.println("The number is palindrome");
}else {
	System.out.println("The number is not palindrome");
}
	}

}
