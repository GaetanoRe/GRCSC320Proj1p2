package dataCreator;
import java.util.Random;
/**
 * <h1>
 * Title: RNGData Class
 * </h1>
 * <h2>
 * Description: Generates random data to be used in the project. It can either generate 32 Character long strings
 * or a random integer between 0 and 10^b. B being any integer they input into the generator.
 * </h2>
 * 
 * @author Gaetano Re
 */
public class RNGData {
	private Random rand; // The random object used to generate numbers used in the randomly generated results
	
	/*
	 * Title: RNGData default constructor
	 * Description: Instantiates the Random object to be used in it's functions.
	 */
	public RNGData() {
		rand = new Random();
	}
	
	
	/**
	 * Title: getRandom String method
	 * Description: Generates a random 32 character long string.
	 * 
	 * @return the 32 character long string.
	 */
	public String getRandomString() {
		char [] randString = new char [32]; // This will be used to contain all of the characters of the rng string
		for(int i = 0; i < randString.length; i++) { // For the length of the string, please repeat the following.
			
			if(rand.nextBoolean()) { /* The nextBoolean method returns a random boolean value.
										I like to think of this as a coin flip!
								     	Let's say that true is heads and false is tails.*/
				
				// If heads, the current character in the string is a random integer from 0-9
				randString[i] = (char) rand.nextInt(49, 57); 
			}
			else {
				
				// If tails, the current character a random capital letter from A-Z
				randString[i] = (char) rand.nextInt(65, 90); 
			}
			
		}
		
		// This will return the string of characters as a java string!
		return String.valueOf(randString);
	}
	
	/**
	 * Title: getRandInt method
	 * Description: Returns a random value from 0 to 10^b
	 * 
	 * @param b, the exponent for the maximum value in the RNG.
	 * @return the random number that this method results in.
	 */
	public int getRandInt(int b) {
		
		// The random integer from 0 to 10^b is generated
		int randInt = rand.nextInt(0, (int)Math.pow(10, b));
		
		// Return the integer that results from this.
		return randInt;
	}
	
	
}
