package com.Array;

import java.util.Arrays;

public class sortAnZeroAndOnce {

	public static void main(String[] args) {
int arr[]= {1,0,0,1,0,1,1,0,0};
int nonZero=0;
for(int i=0;i<arr.length;i++) {
	if(arr[i]!=0) {
		int temp=arr[nonZero];
		arr[nonZero]=arr[i];
		arr[i]=temp;
		nonZero++;
	}
}
System.out.println(Arrays.toString(arr));
	}

}
