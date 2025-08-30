package comRandomNumGenerator;

	import java.util.Random;

	public class RandomName {
	    public static void main(String[] args) {
	        String alphabets = "abcdefghijklmnopqrstuvwxyz";
	        Random rand = new Random();
	        StringBuilder name = new StringBuilder();

	        int length = 5 + rand.nextInt(4); // name length between 5 to 8

	        for (int i = 0; i < length; i++) {
	            char c = alphabets.charAt(rand.nextInt(alphabets.length()));
	            name.append(c);
	        }

	        // Capitalize first letter
	        String finalName = name.substring(0, 1).toUpperCase() + name.substring(1);
	        System.out.println("Random Name: " + finalName);
	    }
	

	static void randomNames() {
	        String letters = "abcdefghijklmnopqrstuvwxyz"; // all small letters
	        Random rand = new Random(); // to pick random letters
	        String name = ""; // empty name to start

	        int length = 5 + rand.nextInt(4); // name will be 5 to 8 letters long

	        for (int i = 0; i < length; i++) {
	            int index = rand.nextInt(letters.length()); // pick random index
	            char letter = letters.charAt(index); // get letter from that index
	            name += letter; // add letter to name
	        }

	        // Make first letter capital
	        name = name.substring(0, 1).toUpperCase() + name.substring(1);

	        System.out.println("Random Name: " + name);
	    }
	}
