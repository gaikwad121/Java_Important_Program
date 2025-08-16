package com.Array;

public class maximumElementInArray {

	public static void main(String[] args) {
 int arr[]= {98,3,45,12,56,8,74,2,1,4,6};
 int max=Integer.MIN_VALUE;
 for(int i=0;i<arr.length;i++) {
	 if(arr[i]>max) {
		 max=arr[i];
	 }
 }
 System.out.println(max);
	}

}
