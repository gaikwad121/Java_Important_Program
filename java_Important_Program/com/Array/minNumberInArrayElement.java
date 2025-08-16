package com.Array;

public class minNumberInArrayElement {
public static void main(String[] args) {
	int arr[]= {98,3,32,56,78,65,56,28,-431};
	int min=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
	if(arr[i]<min) {
		min=arr[i];
	}
}
	System.out.println(min);
}
}