import java.util.ArrayList;
import java.util.Arrays;

import com.itextpdf.text.List;

public class countNonSpaceCharacters {

	public static void main(String[] args) {
		/*
		 * Finds duplicate characters in a given string and prints them. If no
		 * duplicates are found, it prints a message.
		 * 
		 * @param args The command-line arguments.
		 */
		
		String s = "AUTOMATION".toLowerCase();
		char[] character = s.toCharArray();
		boolean isNotDuplicate = true;

		for (int i = 0; i < s.length(); i++) {
			boolean isDuplicate = false;

			for (int j = i + 1; j < s.length(); j++) {
				if (character[i] == character[j]) {
					isDuplicate = true;
					break;
				}
			}
			
			if (isDuplicate) {
				System.out.println(character[i]);
				isNotDuplicate = false;
			}
			if (isNotDuplicate) {
				System.out.println("No duplicates are found!");


		}
		


		
	}}}
