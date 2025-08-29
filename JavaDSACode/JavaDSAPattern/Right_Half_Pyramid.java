
// Right half triangle pattern
import java.util.Scanner;
public class Right_Half_Pyramid{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any num");
int num=sc.nextInt();
for(int i=num;i>=1;i--){
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();
}}
}