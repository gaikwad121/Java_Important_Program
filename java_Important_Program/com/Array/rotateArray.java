package com.Array;

import java.util.Arrays;

public class rotateArray {
public static void main(String[] args) {
	int arr[]= {23,45,67,89,12,67};
	int ans[]=new int[arr.length];
	int n=arr.length;
	int k=3;
	int j=0;
	 k=k%n;
	for(int i=n-k;i<n;i++) {
		ans[j++]=arr[i];
	}
	for(int i=0;i<n-k;i++) {
		ans[j++]=arr[i];
	}
	System.out.println(Arrays.toString(ans));
}
}
