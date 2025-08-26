package CharacterPattern;

public class AlphabetDiamondPattern {
static void pattern() {
int n=6;
int A=65;
for(int i=0;i<=n;i++) {
for(int j=0;j<=n-i;j++) {
	System.out.print(" ");
}
for(int j=0;j<=i;j++) {
System.out.print((char)(A+j)+" ");
}
System.out.println();
}
for(int i=n-1;i>=0;i--) {
for(int j=0;j<=n-i;j++) {
	System.out.print(" ");
}
for(int j=0;j<=i;j++) {
System.out.print((char)(A+j)+" ");
}
System.out.println();
}
}
}
