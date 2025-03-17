import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.itextpdf.text.List;

public class printSequence {

	public static void main(String[] args) {
		/* given string is X3Y2Z1	
		 * one letter; one digit	//X
		 * iterate and start from 0th index
		 * increment by +2 due to alternate nature of letter and digit 	//Y
		 * capture digit from 1st index		\\3
		 * save the captured digit in an integer 	\\repeatCount=3
		 * iterate again (inner loop) up till the captured digit
		 * append character at 0th index (i) to the string		//XXX
		 * print
		 */
		
		String encodedStr = "r5Y1g8";
		StringBuilder number = new StringBuilder();
		
		for(int i=0; i<encodedStr.length(); i+=2) {
			
			//repeatCount =3 in first iteration
			int repeatCount = Character.getNumericValue(encodedStr.charAt(i+1));
			
			for (int k=0; k<repeatCount; k++) {
				number.append(encodedStr.charAt(i));
			}
			
		}
		
		System.out.println(number);
        
		
	}}
