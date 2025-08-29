package com.Array;

import java.util.Arrays;

public class moveAllZeroToEnd {
public static void main(String[] args) {
	int arr[]= {1,4,5,0,0,3,0,0,2,0,1,2,0};
	int Nonzero=0;
	for(int i=0;i<arr.length;i++) {
	if(arr[i]!=0) {
	int temp=arr[Nonzero];
	arr[Nonzero]=arr[i];
	arr[i]=temp;
	Nonzero++;
	}
	}
	System.out.println(Arrays.toString(arr));
}
}
