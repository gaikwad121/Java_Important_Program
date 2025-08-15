package javaPractice14082025;

public class program24 {
	    public static void main(String[] args) {
	    	// An array is monotonic if it is either entirely non-increasing or non-decreasing.
	        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	        boolean increasing = true;
	        boolean decreasing = true;

	        for (int i = 0; i < a.length - 1; i++) {
	            if (a[i] < a[i + 1]) {
	                decreasing = false;
	            }
	            if (a[i] > a[i + 1]) {
	                increasing = false;
	            }
	        }

	        if (increasing || decreasing) {
	            System.out.println("It's a monotonic array");
	        } else {
	            System.out.println("It's not a monotonic array");
	        }
	    }
	}