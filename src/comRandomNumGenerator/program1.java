package comRandomNumGenerator;

import java.util.Random;

public class program1 {

	
static void Generate1Digit() {
Random num=new Random();
int n=num.nextInt(10);
System.out.println(n);
}

static void Generate2Digit() {
Random num=new Random();
int n=num.nextInt(100);
System.out.println(n);
}

static void Generate3Digit() {
Random num=new Random();
int n=num.nextInt(1000);
System.out.println(n);
}
}


