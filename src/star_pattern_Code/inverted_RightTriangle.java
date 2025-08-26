package star_pattern_Code;

public class inverted_RightTriangle {

	static void pattern() {
		for(int i=5;i>=0;i--) {
		for(int j=0;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
		}
	}
}
