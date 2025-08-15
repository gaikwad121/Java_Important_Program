package javaPractice14082025;

public class program7 {
public static void main(String[] args) {
	//Move all zero to end
	int arr[]= {1,0,2,3,0,2,4,5,0,45,80};
	int temp=0;
	int nonZero=0;
	for(int i=0;i<arr.length;i++) {
	if(arr[i]!=0) {
		temp=arr[nonZero];
	   arr[nonZero]=arr[i];
	   arr[i]=temp;
	   nonZero++;
	}
	}
	for(int a:arr)
	System.out.println(a);
}}
