package com.Array;

import java.util.Arrays;

public class zeroAtEnd {
public static void main(String[] args) {
	int arr[]= {1,0,2,0,0,3,0,4,5,0,6,0,0,6,0,0,0};
	int i=0; 
	int j=arr.length-1;
	while(i<j) {
		if(arr[i]==0) {
			
		
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
	
	j--;
	}else {
		i++;
	}
	}
	System.out.println(Arrays.toString(arr));
}
}

