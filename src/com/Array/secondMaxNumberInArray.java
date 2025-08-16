package com.Array;

public class secondMaxNumberInArray {
public static void main(String[] args) {
	int arr[]= {8,9,45,32,12,5,45,69,98,101};
	int max=Integer.MIN_VALUE;
	int secondMax=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=max && arr[i]>secondMax) {
			secondMax=arr[i];
		}
	}
	System.out.println(secondMax);
}
}
