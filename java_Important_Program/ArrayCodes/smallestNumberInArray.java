package ArrayCodes;

public class smallestNumberInArray {

	public static void main(String[] args) {
int arr[]= {20,56,89,74,11,25,43,33};
SmallestNum(arr);
	}
static void SmallestNum(int arr[]) {
	int min=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
	}
	}
	System.out.println(min);
}
}
