package PracticeGroupStudy;
import java.util.*;
public class LengthInString115 {
public static void main(String[] args) {
	
	  Scanner input = new Scanner(System.in);
	  int counter =0;
	  String longerWord = "";
		String[] words = new String[5];
		for(int i = 0; i < 5;  i++) {
		  
		  words[i] = input.nextLine();
		  
		}
		for(int j = 0; j < words.length-1; j++) {
			for (int y = 0; y < words.length; y++) {
				if(j > y) {
					counter++;
				}
				}if(counter == 1) {
					longerWord = words[j];
			counter = 0;
			}
		}
		System.out.println(longerWord);
		
		



}
}
