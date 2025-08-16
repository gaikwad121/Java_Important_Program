package com.Array;

import java.util.Arrays;

public class reverseTheArray {
public static void main(String[] args) {
	int[] arr= {3,2,1,56,6,7,8,9};
	int ans[]=new int [arr.length];
	int j=0;
	for(int i=arr.length-1;i>=0;i--) {
     ans[j++]=arr[i];
	}

System.out.println(Arrays.toString(ans));
}}
