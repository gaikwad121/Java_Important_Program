package star_pattern_Code;

public class Hollow_Pyramid_Star_Pattern {
static void pattern() {
for(int i=0;i<=5;i++) {
for(int j=0;j<=i;j++) {
if(i==0 || j==0 || i==j || i==5 ) {
	System.out.print("*");
}else {
	System.out.print(" ");
}}
System.out.println();
}
}
}

