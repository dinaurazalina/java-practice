package PracticeGroupStudy;
import java.util.*;
public class homeworkJavaAppears {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	boolean exists = false;
	String word = scan.next();
	
	if(word.substring(0,4).equals("java") || word.substring(1,5).equals("java")) {
		exists = true;
	}else {
		exists = false;
	}
}
}
