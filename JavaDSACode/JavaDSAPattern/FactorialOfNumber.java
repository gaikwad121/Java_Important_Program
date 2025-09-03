import java.util.Scanner;
public class FactorialOfNumber{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any num");
int num=sc.nextInt();
if(num<0){
System.out.println("The factorial not found for negative number");
}else{
int factorial=1;
for(int i=1;i<=num;i++){
factorial*=i;
}
System.out.println(factorial);
}}}