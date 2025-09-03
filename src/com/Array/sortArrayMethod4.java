package com.Array;

public class sortArrayMethod4 {
public static void main(String[] args) {
	int arr[]= {45,85,63,21,12,49,53,77,35};
	for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
	if(arr[i]>arr[j]) {
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	}
	}
	}
	for(int a:arr) {
		System.out.println(a);
	}
	}
}

