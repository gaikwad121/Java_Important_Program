package AllowCodePracticeReview;

public class MoveAllZeroToEnd2 {
	public static void main(String[] args) {
		
	
int arr[]= {1,0,3,0,5,0,0,8};
int j=arr.length-1;
int NonZero=0;
for(int i=0;i<arr.length;i++) {
	if(arr[i]!=0) {
		int temp=arr[NonZero];
		arr[NonZero]=arr[i];
		arr[i]=temp;
		NonZero++;
	}
}
	for(int ar:arr) {
		System.out.println(ar);
	}
}
}
