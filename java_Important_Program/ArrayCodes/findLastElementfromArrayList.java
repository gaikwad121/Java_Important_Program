package ArrayCodes;

import java.util.ArrayList;

public class findLastElementfromArrayList {

	public static void main(String[] args) {
		firstAndLastNameFromList();
	}
static void firstAndLastNameFromList() {
	ArrayList<String> name=new ArrayList<String>();
	name.add("Apple");
	name.add("Mongo");
	name.add("Banana");
	name.add("cucumber");
	name.add("coconant");
if(!name.isEmpty()) {
	System.out.println(name.get(0));
	System.out.println(name.getLast());
}
}
}
