import java.math.BigInteger;

import java.util.Scanner;
public class FactorialList{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any num");
int num=sc.nextInt();
BigInteger fact = BigInteger.ONE;
for(int i=1;i<=num;i++){
            fact=fact.multiply(BigInteger.valueOf(i));

System.out.println(fact);
}
}}