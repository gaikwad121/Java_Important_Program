package Codes;

public class swapTwoNumber {

	public static void main(String[] args) {

		int a=67;
		int b=98;
		System.out.println("Before Swaping "+" "+a+ " "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swaping "+" "+a+ " "+b);

		int c=34;
		int d=89;
		System.out.println("Before Swaping "+" "+c+ " "+d);

		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println("After Swaping "+" "+c+ " "+d);
		
		
		int e=34;
		int f=89;
		System.out.println("Before Swaping "+" "+e+ " "+f);

		e=e*f;
		f=e/f;
		e=e/f;
		System.out.println("After Swaping "+" "+e+ " "+f);
		int g=89;
		int h=45;
		System.out.println("Before Swaping "+" "+g+ " "+h);

		g=g^h;
		h=g^h;
		g=g^h;
		System.out.println("After Swaping "+" "+g+ " "+h);

	}

}
