package star_pattern_Code;

public class pyramidPattern {

	static void pattern() {
	for(int i=0;i<=5;i++) {
	for(int j=0;j<=5-i;j++) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print("* ");
	}
	System.out.println();
	}
	}
}
