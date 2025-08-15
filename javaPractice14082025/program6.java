package javaPractice14082025;

public class program6 {
public static void main(String[] args) {
	// second Largest number
	int arr[]= {98,45,32,12,7,56,82,56};
	int max=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
		System.out.println(max);
	
	int secondMax=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
if(arr[i]!=max && arr[i]>secondMax) {
	secondMax=arr[i];
}
	}
System.out.println(secondMax);
}
}
