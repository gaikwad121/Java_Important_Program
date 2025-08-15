package AllowCodePracticeReview;

public class secondLargestElementInArray {

	public static void main(String[] args) {

		int arr[]= {1,2,3,4,5,9,75,45,87};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
			max=arr[i];
			}
		}
			System.out.println(max);
			int secondMax=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=max && arr[i]>secondMax) {
					secondMax=arr[i];
				}
			}
			System.out.println(secondMax);
		}
	}


