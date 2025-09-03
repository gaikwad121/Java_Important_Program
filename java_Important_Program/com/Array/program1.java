package com.Array;

public class program1 {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,8,9};
	int j=0;
	int ans[]=new int[arr.length];
	for(int i=arr.length-1;i>=0;i--)
	{
		ans[j++]=arr[i];
	}
	for(int a:ans)
	System.out.println(a);
	
}}
	/*int i=0;
	int j=arr.length-1;
	while(i<j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
		
	}
	for(int arr1:arr) {
		System.out.println(arr1);
	}
}
}*/
