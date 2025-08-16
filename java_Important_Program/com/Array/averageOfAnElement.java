package com.Array;

public class averageOfAnElement {

	public static void main(String[] args) {
int arr[]= {1,2,3,4,5,5,6};
double sum=0;
double average=0;
for(int a:arr) {
	sum=sum+a;
}
average=sum/arr.length;
	
System.out.println(average);
}
}