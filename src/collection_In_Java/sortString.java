package collection_In_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return 02-01;
	}
	
}
public class sortString {
public static void main(String[] args) {
	List<Integer> fruit= new ArrayList<>();
			//Arrays.asList("Mango","Banana","apple","cucumber","chicku");
	 fruit.add(2);
	 fruit.add(4);
	 fruit.add(5);
	 fruit.add(45);
    //fruit.sort(String.CASE_INSENSITIVE_ORDER);
	//System.out.println(fruit);
       // Collections.sort(fruit);
    fruit.sort(new MyComparator());
	System.out.println(fruit);
}
}
