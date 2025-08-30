package comRandomNumGenerator;

	import java.util.Random;

	public class RandomSSN {
	    public static void main(String[] args) {
	        Random rand = new Random();

	        int part1 = 100 + rand.nextInt(900);  // 100 to 999
	        int part2 = 10 + rand.nextInt(90);    // 10 to 99
	        int part3 = 1000 + rand.nextInt(9000); // 1000 to 9999

	        String ssn = part1 + "-" + part2 + "-" + part3;
	        System.out.println("Random SSN-style Number: " + ssn);
	    }
	}

