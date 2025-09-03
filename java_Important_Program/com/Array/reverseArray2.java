package com.Array;

import java.util.Arrays;

public class reverseArray2 {
public static void main(String[] args) {
	int arr[]= {9,8,4,5,3,2,1,6,7};
	int i=0;
	int j=arr.length-1;
	while(i<j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
	System.out.println(Arrays.toString(arr));
}
}
