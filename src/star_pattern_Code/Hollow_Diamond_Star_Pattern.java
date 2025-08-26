package star_pattern_Code;

public class Hollow_Diamond_Star_Pattern {
static void pattern() {
for(int i=1;i<=5;i++) {
for(int j=1;j<=5-i;j++) {
	System.out.print(" ");
}
for(int j=1;j<=i;j++) {
	if(i==j || i==1 || j==1) {
	System.out.print("* ");
}else {
	System.out.print(" ");
}
    if (j < i) System.out.print(" ");

}
System.out.println();
}
for(int i=5-1;i>=1;i--) {
for(int j=1;j<=5-i;j++) {
	System.out.print(" ");
}
for(int j=1;j<=i;j++) {
	if(i==j  || i==1 || j==1) {
	System.out.print("* ");
}else {
	System.out.print(" ");
}
    if (j < i) System.out.print(" ");

}
System.out.println();
}}}

