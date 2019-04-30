package PracticeGroupStudy;
import java.util.*;
public class HomeworkArraysPrintSentence {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
    
    String strArray[] = sentence. split(" ");
    for (String output :strArray ) {
    	System.out.println(output);
    }
}
}
