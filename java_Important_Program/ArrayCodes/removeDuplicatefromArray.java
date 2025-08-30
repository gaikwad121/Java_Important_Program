package ArrayCodes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicatefromArray {

	public static void main(String[] args) {
int arr[]= {4,5,6,2,3,4,6,3,4,7};
remove(arr);
	}
static void remove(int arr[]) {
	Set<Integer> set=new LinkedHashSet<>();
	for(int a:arr) {
		set.add(a);
	}
	for(int b:set) {
		System.out.println(b);
	}
}
}
