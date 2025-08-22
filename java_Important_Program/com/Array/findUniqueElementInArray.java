package com.Array;

public class findUniqueElementInArray {

	public static void main(String[] args) {
 int arr[]= {2,34,2,6,78,6,6,6,90,34,7,23,24};
 for(int i=0;i<arr.length;i++) {
for(int j=i+1;j<arr.length;j++) {
	if(arr[i]==arr[j]) {
		arr[i]=-1;
		arr[j]=-1;
		break;
	}
}
 }
 int ans=0;
 for(int i=0;i<arr.length;i++) {
	 if(arr[i]>0) {
	 System.out.println(arr[i]);
 }
	}}}


