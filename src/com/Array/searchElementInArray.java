package com.Array;

public class searchElementInArray {
public static void main(String[] args) {
	int arr[]= {1,2,4,5,6,7,8,9,3,4};
	int num=3;
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==num) {
			count++;
		}
	}
		 if(count>0) {
				System.out.println("The number "+"is  found time is "+ count +" the number is "+num);

		}else {
			System.out.println("The number is not  found");

		}
	}
}

