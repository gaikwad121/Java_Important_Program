package com.Array;

import java.util.Arrays;

public class ascendingOrder {

	public static void main(String[] args) {
int arr[]= {2,4,5,87,99,23,55,28,77,851};
for(int i=0;i<arr.length;i++) {
for(int j=0;j<arr.length;j++) {
	if(arr[i]>arr[j]) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
}
System.out.println(Arrays.toString(arr));
	}

}
