package star_pattern_Code;

public class Diamond_Star_Pattern {

	static void pattern() {
	for(int i=0;i<=5;i++) {
	for(int j=0;j<=5-i;j++) {
	System.out.print(" ");
	}
	for(int j=0;j<=i;j++) {
	System.out.print("* ");
	}
	System.out.println();
	}
	for(int i=5-1;i>=0;i--) {
	for(int j=0;j<=5-i;j++) {
	System.out.print(" ");
	}
	for(int j=0;j<=i;j++) {
	System.out.print("* ");
	}
	System.out.println();
	}
	}
}
