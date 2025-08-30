package comRandomNumGenerator;

import java.util.Random;

public class program2 {

	static void RandomDigit1() {
	Random num=new Random();
	double n=num.nextDouble(10);
	System.out.println(n);
	}
	
	static void RandomDigit2() {
		Random num=new Random();
		double n=num.nextDouble(100);
		System.out.println(n);
		}
	static void RandomDigit3() {
		Random num=new Random();
		double n=num.nextDouble(1000);
	}
}
