package ArrayCodes;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElementBetweenTwoArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int arr1[] = {9, 8, 7, 6, 5, 4, 3};

        Set<Integer> commonElements = commonEle(arr, arr1);
        System.out.println("Common Elements: " + commonElements);
    }

    static Set<Integer> commonEle(int arr[], int arr1[]) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> commonSet = new HashSet<>();

        for (int a : arr) {
            set.add(a);
        }

        for (int b : arr1) {
            if (set.contains(b)) {
                commonSet.add(b);
            }
        }

        return commonSet;
    }
}