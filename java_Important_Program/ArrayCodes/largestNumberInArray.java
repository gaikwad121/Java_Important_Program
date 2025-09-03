package ArrayCodes;

public class largestNumberInArray {

	public static void main(String[] args) {
		int arr[]= {20,56,89,74,11,25,43,33};
maxNum(arr);
	}
static void maxNum(int arr[]) {
	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
		max=arr[i];
	}
	}
	System.out.println(max);
}
}
