package AllowCodePracticeReview;

public class swapToNumber {
public static void main(String[] args) {
	int a=89;
	int b=78;
	System.out.println(a+" "+b);

/*	int temp=a;
	a=b;
	b=temp;*/
	/*a=a*b;
	b=a/b;
	a=a/b;*/
/*	a=a+b;
	b=a-b;
	a=a-b;*/
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println(a+" "+b);
}
}
