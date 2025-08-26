package number_Pattern_Code;

public class numberPyramid {
	static void pattern() {
for(int i=1;i<=5;i++) {
for(int j=1;j<=5-i;j++) {
	System.out.print(" ");
}
for(int j=1;j<=i;j++) {
	System.out.print(j+" ");
}
System.out.println();
}
}}
