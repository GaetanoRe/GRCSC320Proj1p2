package project1p2;
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
		
		FileCreator fileCreator = new FileCreator();
		
		// If the user typed in an argument
		if(args.length == 2) {
			fileCreator.setIterator(Math.abs(Integer.parseInt(args[0]))); // The first argument is an integer. Convert it into an integer
			fileCreator.setCommand(args[1].charAt(0)); // the second argument is a character. It only takes the first letter of the second argument.
			try {
				fileCreator.createFile();
			}catch(IOException e) { // Catch the exception in case anything goes wrong with the file writer.
				System.out.println("An error occured making the file " + fileCreator.getIterator() + fileCreator.getCommand() + ".txt");
				e.printStackTrace();
			}
				
			}
		else {
			System.out.println("Invalid Argument"); // If there are not 2 arguments, then the argument is invalid.
		}
	}
}
