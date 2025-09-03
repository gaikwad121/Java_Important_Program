import java.util.Scanner;
public class sumNoAndRev{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any num");
int num=sc.nextInt();
int sum=0;
int rev=0;
while(num!=0){
rev=rev*10+num%10;
num/=10;
}
sum=rev+num;

System.out.println(sum);
}}