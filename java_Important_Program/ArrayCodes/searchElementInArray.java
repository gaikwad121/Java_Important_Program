package ArrayCodes;

public class searchElementInArray {

	public static void main(String[] args) {
int arr[]= {5,8,7,9,89,6,2,2,45,67,89,32,89,89,9};
int num=89;
searchElement(arr, num);
	}
static void searchElement(int arr[],int num) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==num) {
			count++;
		}
	}
			if(count>0) {
				System.out.println("The number found : "+num+" "+"Found time : "+count);
			}
		}
	}

