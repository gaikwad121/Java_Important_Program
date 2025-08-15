package AllowCodePracticeReview;

public class missingNumberInArray_NeedToPractice_More {

	public static void main(String[] args) {
		
		//int num[]= {1,2,4,5,6};
		int num[]= {1,2,3,5,6,7};
int sum=0;
int sum1=0;
int num1[]=new int[num.length+1];
		System.out.println("Missing number is: " + findMissingNumber(num));
			}
	
		 public static int findMissingNumber(int[] arr) {
		        int n = arr.length + 1; // since one number is missing
		        int expectedSum = n * (n + 1) / 2;

		        int actualSum = 0;
		        for (int num : arr) {
		            actualSum += num;
		        }

		        return expectedSum - actualSum;
		    }

		    }
