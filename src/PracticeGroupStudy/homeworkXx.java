package PracticeGroupStudy;
import java.util.Scanner;
public class homeworkXx {
	public static void main(String[] args) {
		
	
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    
		  
		    if (word.toLowerCase().startsWith("x")) {
		    	System.out.println(word.substring(1));
		    }		
	    
		    if(word.toLowerCase().endsWith("x")) {
		    	System.out.println(word.substring(0,word.length()-1));
		    }
		    
		    
}
	}