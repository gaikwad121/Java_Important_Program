package number_Pattern_Code;

public class InvertedNumberPyramid {

	static void pattern() {
	for(int i=5;i>=1;i--) {
	for(int j=1;j<=5-i;j++) {
	System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
	System.out.print(j+" ");
	}
	System.out.println();
	}
	}
}
