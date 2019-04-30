package PracticeGroupStudy;
import java.util.*;
public class HomeworkPrefix {
public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);

	String str = scan.next();
	    int n = scan.nextInt();
	    int count =0;
	    
	    String subStr = str.substring(0, n);
	    
	    for (int i = 0; i<=str.length()-n;i++) {
	    	if(str.substring(i, i+n).equals(subStr)) {
	    		count++;
	    	}
	    }
	
	    			
}
}