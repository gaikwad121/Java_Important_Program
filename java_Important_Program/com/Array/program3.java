package com.Array;

import java.util.Arrays;

public class program3 {
public static void main(String[] args) {
	//copy the array
	int arr[]= {2,3,4,5,6,7,8,9};
	int ans[]=new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		ans[i]=arr[i];
	}
	System.out.println(Arrays.toString(ans));
}
}
