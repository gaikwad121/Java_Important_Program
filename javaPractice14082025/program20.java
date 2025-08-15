package javaPractice14082025;

public class program20 {
public static void main(String[] args) {
	// leaders in Array
	// for finding leaders in array is we have to check in the is any number greater than left max number
	// and the remaining last number is a leader number
	
	        // Leaders in Array
	        int a[] = {16, 17, 4, 3, 5, 2,7};
	        int maxRight = a[a.length - 1];

	        // Last element is always a leader
	        System.out.println(maxRight);

	        for (int index = a.length - 2; index >= 0; index--) {
	            if (a[index] > maxRight) {
	                maxRight = a[index];
	                System.out.println(maxRight);
	            }
	        }
	    }
	}