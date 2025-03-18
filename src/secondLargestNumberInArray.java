import java.util.ArrayList;
import java.util.Arrays;

import com.itextpdf.text.List;

public class secondLargestNumberInArray {

	public static void main(String[] args) {
			int temp;
			int array[]= {30, 15, 20};
			int size=array.length;
			
			for(int i=0; i<size; i++) {
				for(int j=i+1; j<size; j++) {
					if(array[i]>array[j]) { //i30>j15
						temp = array[i]; //temp30
						array[i] = array[j]; //i15
						array[j] = temp; //j30 //15,30,20 
					}
					
				}
			}
			//15,20,30 (3-2 at index 1 
			System.out.println("2nd largest "+array[size-2]);
	}
}


