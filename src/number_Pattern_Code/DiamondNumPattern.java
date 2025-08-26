package number_Pattern_Code;

public class DiamondNumPattern {

	static void pattern() {
		int n=6;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
	for(int j=1;j<=i;j++) {
	System.out.print(j+" ");
	}
	System.out.println();
	}
	
	for(int i=n-1;i>=1;i--) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
	for(int j=1;j<=i;j++) {
	System.out.print(j+" ");
	
	}
	System.out.println();
	}
	}}

