package java_Codes;

import java.util.Scanner;

public class pattern_practiceDay01_StarPatter {
public static void main(String[] args) {
	int num=input();
	rightAnglePattern(num);
	FullPyramid(num);
	reverseFullPyramid(num);
	FloydTriangle(num);
	PascalsTraingle();
	ButterFlypattern(num);
}


static int input() {
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number");
	return  num=sc.nextInt();
}
static void rightAnglePattern(int n) {
	
	
	for(int i=1;i<=n;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print("*");
	}
	System.out.println();
	}
}
	static void FullPyramid(int n) {
		for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
		}
	}
	static void reverseFullPyramid(int n) {
	for(int i=n;i>=1;i--) {
	for(int j=1;j<=n-i;j++) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print("* ");
	}
	
	System.out.println();
	}
}
	static void FloydTriangle(int n) {
		int count=1;
	for(int i=1;i<=n;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(count+" ");
		count++;
	}
	System.out.println();
	}
	}
	static void PascalsTraingle() {
		int rows = 5;
		for (int i = 0; i < rows; i++) {
		    int num = 1;

		    // Print spaces for triangle shape
		    for (int s = 0; s < rows - i - 1; s++) {
		        System.out.print(" ");
		    }

		    // Print numbers in the row
		    for (int j = 0; j <= i; j++) {
		        System.out.print(num + " ");
		        num = num * (i - j) / (j + 1); // Magic formula
		    }

		    System.out.println();
		}
	}
	static void ButterFlypattern(int n) {
	for(int i=1;i<=n;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print("*");
	}
	for(int j=1;j<2*(n-i);j++) {
		System.out.print(" ");
	}
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=n-1;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
		}
		for(int j=1;j<2*(n-i);j++) {
			System.out.print(" ");
		}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}













