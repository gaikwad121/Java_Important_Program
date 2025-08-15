package AllowCodePracticeReview;

public class MoveAllZeroToFront {
public static void main(String[] args) {
	int arr[]= {2,3,0,0,8,0,0,0,2,3,5};
	int nonZeroPut=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			int temp=arr[nonZeroPut];
			arr[nonZeroPut]=arr[i];
			arr[i]=temp;
			nonZeroPut++;
		}}
		for(int arr1:arr) {
			System.out.println(arr1);
		}
	}
}

