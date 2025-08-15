package javaPractice14082025;

public class program5 {
public static void main(String[] args) {
	int a=0;
	// missing number in array
	int arr[]= {1,2,3,4,5,6,7,9,10,11,12};
	int actualsum=0;
	int n=arr.length+1;
	for(int i=0;i<arr.length;i++) {
		actualsum =actualsum+arr[i];
		
	
	int expectedSum=n*(n+1)/2;
	 a=expectedSum-actualsum;
}
	System.out.println(a);
	
}
}