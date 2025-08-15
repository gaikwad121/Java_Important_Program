package javaPractice14082025;

public class program28 {
public static void main(String[] args) {
	// separate a Alphabet and digit
	//Character.isDigit(0); this is a inbuilt method in a java
	String input="Ra123j";
	StringBuilder alphabet=new StringBuilder();
	StringBuilder number=new StringBuilder();
	char inputArray[]=input.toCharArray();
	for(char currentChar:inputArray){
	if(Character.isDigit(currentChar)){
	number.append(currentChar);
	}else if(Character.isAlphabetic(currentChar)){
	alphabet.append(currentChar);
	}}
	System.out.println("Alphabet"+" "+alphabet);
	System.out.println("Digit"+" "+number);
}

}
