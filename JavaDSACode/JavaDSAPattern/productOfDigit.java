import java.util.Scanner;
public class productOfDigit{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any num");
int num=sc.nextInt();
int mul=1;
if(num==0){
System.out.println("the product is zero");
}while(num!=0){
int n=num%10;
mul*=n;
num/=10;
}

System.out.println(mul);
}}