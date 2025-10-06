package project1p2;
import java.util.*;
public class FilenameComparator implements Comparator<String>{

	@Override
	public int compare(String a, String b) {
		String nameA = a.replace(".txt", "");
		String nameB = b.replace(".txt", "");
		
		int numA = Integer.parseInt(nameA.replaceAll("[^0-9]", ""));
		int numB = Integer.parseInt(nameB.replaceAll("[^0-9]", ""));
		
		char typeA = nameA.replaceAll("[0-9]", "").charAt(0);
		char typeB = nameB.replaceAll("[0-9]", "").charAt(0);
		
		if(numA != numB) {
			return Integer.compare(numA, numB);
		}
		return Character.compare(typeA, typeB);
	}

}
