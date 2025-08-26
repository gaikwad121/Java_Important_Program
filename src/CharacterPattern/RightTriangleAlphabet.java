package CharacterPattern;

public class RightTriangleAlphabet {
	
static void pattern() {
	int n=5;
	int A=65;
  for(int i=0;i<=n;i++) {
for(int j=0;j<=i;j++) {
System.out.print((char)(A+j)+" ");
}
System.out.println();
  }
}
}
