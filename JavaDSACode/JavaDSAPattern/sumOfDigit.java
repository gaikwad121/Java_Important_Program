import java.util.Scanner;
public class sumOfDigit{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any num");
int num=sc.nextInt();
int sum=0;
while(num!=0){
int n=num%10;
sum+=n;
num/=10;
}
System.out.println(sum);
}}
