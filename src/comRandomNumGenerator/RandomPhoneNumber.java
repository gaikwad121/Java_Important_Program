package comRandomNumGenerator;

	import java.util.Random;

	public class RandomPhoneNumber {
	    public static void main(String[] args) {
	        Random rand = new Random();

	        // First digit should not be 0 or 1 (common rule)
	        int firstDigit = 7 + rand.nextInt(3); // gives 7, 8, or 9
	        String phone = firstDigit + "";

	        for (int i = 0; i < 9; i++) {
	            phone += rand.nextInt(10); // adds 9 more digits
	        }

	        System.out.println("Random Phone Number: " + phone);
	    }
	

}
