package PracticeGroupStudy;
import java.util.*;
public class homeworkSeparator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();
	    int i = 1;
	    String fullname = "";
	    while(i <= count) {
	    	if(i < count) {
	    	fullname += word + separator;
	    	}else {
	    		fullname += word ;	
	    	}
	    	i++;
	    }
	    System.out.println(fullname);
	}
}
