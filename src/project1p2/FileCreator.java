package project1p2;
import java.io.*;
public class FileCreator {
	
	private RNGData data;
	private File fileGen;
	private FileWriter fileWriter;
	private int iterator;
	private char command;
	
	
	public FileCreator(){
		data = new RNGData();
		iterator = 0;
		command = 0;
	}
	
	public int getIterator() {
		return this.iterator;
	}
	
	public char getCommand() {
		return this.command;
	}
	
	public void setIterator(int it) {
		this.iterator = it;
	}
	
	public void setCommand(char comm) {
		this.command = comm;
	}
	
	public void createFile() throws IOException{
		switch(command) { 
			case 'i': // In the case the second argument is i
				fileGen = new File("" + iterator + command + ".txt");
				if(fileGen.createNewFile()) // If the file was created, then associate the file writer to the file.
					fileWriter = new FileWriter(fileGen);// generate a new file
				for(int i = 0; i < Math.pow(10, iterator); i++) {
					fileWriter.append(data.getRandInt(iterator) + ","); // Write the random integer values into the text file. 
				}
				break;
			case 's': // In the case the second argument is s
				fileGen = new File("" + iterator + command + ".txt");
				if(fileGen.createNewFile()) // If the file was created, then associate the file writer to the file.
					fileWriter = new FileWriter(fileGen);
				for(int i = 0; i < Math.pow(10, iterator); i++) {
						fileWriter.append(data.getRandomString() + ","); // Write the random string values into the text file.
				}
				break;
			default:
				throw new IOException();
			}
		}
	
	

}
