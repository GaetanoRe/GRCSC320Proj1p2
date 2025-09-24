package dataCreator;
import java.util.*;
import java.io.*;
/**
 * <h1>
 * Title : Data Creation Application Main Class
 * </h1>
 * <h2>
 * Description: This is the main class that utilizes all of the methods needed to create a set of data
 * for the experiment used in project 1
 * </h2>
 * 
 * @author Gaetano Re
 * 
 */
public class Main {
	
	public static void main(String [] args){
		
		// This object utilizes a random number generator to randomly generate a number or a string.
		RNGData data = new RNGData();
		
		// This represents the file that will be generated.
		File fileGen;
		
		// This represents the writer that will write to the file being generated.
		FileWriter fileWriter;
		
		// The values of the command itself.
		int iterator = 0; // the value b
		char command = 0; // the command that makes the generated values integers or strings.
		
		// If the user typed in an argument
		if(args.length == 2) {
			iterator = Math.abs(Integer.parseInt(args[0])); // The first argument is an integer. Convert it into an integer
			command = args[1].charAt(0); // the second argument is a character. It only takes the first letter of the second argument.
			try {
				fileGen = new File("" + iterator + command + ".txt"); // generate a new file
				if(fileGen.createNewFile()) { // If the file was created, then associate the file writer to the file.
					fileWriter = new FileWriter(fileGen);
					switch(command) { 
						case 'i': // In the case the second argument is i
							for(int i = 0; i < Math.pow(10, iterator); i++) {
								fileWriter.append(data.getRandInt(iterator) + ","); // Write the random integer values into the text file. 
							}
							break;
						case 's': // In the case the second argument is s
							for(int i = 0; i < Math.pow(10, iterator); i++) {
								fileWriter.append(data.getRandomString() + ","); // Write the random string values into the text file.
							}
							break;
						default:
							System.out.println("Invalid Argument"); // If the second argument is neither i or s, then it is invalid.
						}
				}
			}catch(IOException e) { // Catch the exception in case anything goes wrong with the file writer.
				System.out.println("An error occured making the file " + iterator + command + ".txt");
				e.printStackTrace();
			}
			
			
				
			}
		else {
			System.out.println("Invalid Argument"); // If there are not 2 arguments, then the argument is invalid.
		}
	}
}
