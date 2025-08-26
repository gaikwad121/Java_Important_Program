package CharacterPattern;

public class ContinuousAlphabetPattern {
	static void pattern() {
int n=3;
int A=65;
int count;
for(int i=0;i<=n;i++) {
for(int j=0;j<=i;j++) {
System.out.print((char)(A)+" ");


A++;
}
System.out.println();
}
}}
