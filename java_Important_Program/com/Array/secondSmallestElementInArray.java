package com.Array;

public class secondSmallestElementInArray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,8,9};
	int min=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
	if(arr[i]<min) {
		min=arr[i];
	}
	}
	int secondMin=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
	 if(arr[i]!=min && arr[i]<secondMin) {
			secondMin=arr[i];
		}
	}
	System.out.println(secondMin);
}
}
