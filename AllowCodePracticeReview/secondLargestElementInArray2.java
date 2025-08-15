package AllowCodePracticeReview;

public class secondLargestElementInArray2 {
public static void main(String[] args) {

	int arr[]= {1,4,6,78,90,87,32,45,62,56};
	int max=0;

	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println("The maximum value in array is : "+max);
	int secondMax=0;

	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=max && arr[i]>secondMax ) {
			secondMax=arr[i];
		}
	}	
	System.out.println("The secondMax value in array is : "+secondMax);
}
}
