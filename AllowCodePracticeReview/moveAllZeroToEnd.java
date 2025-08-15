package AllowCodePracticeReview;

import java.util.Arrays;

public class moveAllZeroToEnd {

	public static void main(String[] args) {
		int arr[]= {9,0,3,0,0,1,0,0,4,0,5,0,0};
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
				
			}
		
		for(int a:arr) {
			System.out.println(a);
		}
	}}}