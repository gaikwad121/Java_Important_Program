/*package javaPractice14082025;

public class program27 {
public static void main(String[] args) {
	// count the number of chaning key
	String input="abBc";
	int count=0;
	char Lastkey=input.toCharArray()[0];
	Lastkey=Character.toLowerCase(Lastkey);
	for(int i=1;i<=input.length()-1;i++){
	char currentKey=input.toCharArray()[i];
	currentKey=Character.toLowerCase(currentKey);
	if(currentKey!=Lastkey){
	count++;
	}
	Lastkey=currentKey;
	}
	System.out.println(count);
	
}
}
*/
package javaPractice14082025;

public class program27 {
    public static void main(String[] args) {
        String input = "abBcdef";
        int count = 0;

        char[] chars = input.toCharArray();
        char lastKey = Character.toLowerCase(chars[0]);

        for (int i = 1; i < chars.length; i++) {
            char currentKey = Character.toLowerCase(chars[i]);
            if (currentKey != lastKey) {
                count++;
            }
            lastKey = currentKey;
        }

        System.out.println(count); // Output: 2
    }
}