/** Check if an array is Mountain Array or not
** condition --> 1) length of Array must be freater than 2
2) The elements from oth index to I index it should be increasing ordr if(a[i+1]>a[i])
3) Once you reach the peak the elements must be strictly descrasing if(a[i]>a[i+1]*/



package javaPractice14082025;


public class program22 {
    public static void main(String[] args) {
       // int arr[] = {1, 2, 3, 4, 5, 6, 7, 8}; // Only increasing
    	int arr[]={6,1,2,4,6,3,1,0};
       /* boolean result = check(arr);
        if (result) {
            System.out.println("Mountain array");
        } else {
            System.out.println("Not Mountain array");
        }
    }*/
    	boolean result1=mountainArrayCheck(arr);
    	if(result1) {
    		System.out.println("Mountain array");
    }
    	else{
    		System.out.println(" not Mountain array");

    		}
    	}
    private static Boolean mountainArrayCheck(int[]arr){
    	//1. length of the array must be greater than 2
    	if(arr.length<3){
    	return false;
    	}
    	//2. Elements must be increasing order
    	int i=0;
    	while(i+1<arr.length && arr[i]<arr[i+1]){
    	i++;
    	}
    	while(i+1<arr.length && arr[i]>arr[i+1]){
    	i++;
    	}
    	System.out.println(i);
       // return arr.length - 1==i;
    	if(arr.length-1==i) {
    		return true;
    	}else {
    		return false;
    	}

    	}}

   /* static boolean check(int arr[]) {
        if (arr.length < 3) {
            return false;
        }

        int i = 0;

        // Ascending part
        while (i + 1 < arr.length && arr[i] < arr[i + 1]) {
            i++;
        }

        // Peak can't be first or last
        if (i == 0 || i == arr.length - 1) {
            return false;
        }

        // Descending part
        while (i + 1 < arr.length && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == arr.length - 1;
    }
}*/