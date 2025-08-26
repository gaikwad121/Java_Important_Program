package star_pattern_Code;

public class Inverted_Pyramid_Star_Pattern {

	static void pattern() {
	for(int i=5;i>=0;i--) {
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
