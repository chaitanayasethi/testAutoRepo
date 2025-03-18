import java.util.ArrayList;
import java.util.Arrays;

import com.itextpdf.text.List;

public class FindDuplicateStringCharacter {

	public static void main(String[] args) {
		/*
		 * Calculates get the count of
		 * Capitalized words in a String.
		 */
		
		String input = "e2f3j6";
		StringBuilder output = new StringBuilder();
		
		for (int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(Character.isLetter(ch)) {
				char letter = ch;  // Get the letter
                int count = Character.getNumericValue(input.charAt(i + 1));  // Get the count (next character)
                for (int j = 0; j < count; j++) {
                    output.append(letter);  // Append the letter 'count' times
                }
                i++; // Skip the number after the letter
            }
        }
		
		// Print the result
        System.out.println(output.toString());
			}
		
			
	}

