package ArrayCodes;

import java.util.Arrays;

public class ascendingOrder {

	public static void main(String[] args) {
int arr[]= {9,7,8,6,5,4,3,2,1};
ascending(arr);
	}
static void ascending(int arr[]) {
for(int i=0;i<arr.length;i++) {
for(int j=0;j<arr.length;j++) {
if(arr[i]<arr[j]) {
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
}
}
	System.out.println(Arrays.toString(arr));
}
}
