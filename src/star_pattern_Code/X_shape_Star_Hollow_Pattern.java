package star_pattern_Code;

public class X_shape_Star_Hollow_Pattern {
public static void main(String[] args) {
	pattern();
}
	static void pattern() {
		int n=6;
	for(int i=n;i>=1;i--) {
	for(int j=1;j<=n-i;j++) {
	System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		if(i==j || j==1) {
	System.out.print("* ");
	}else {
		System.out.print(" ");
	}
		if(j<i) {
			System.out.print(" ");
		}
	}
	System.out.println();
	}
	for(int i=2;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
		System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			if(i==j || j==1) {
		System.out.print("* ");
		}else {
			System.out.print(" ");
		}
			if(j<i) {
				System.out.print(" ");
			}
		}
		System.out.println();
		}
	}}
	
