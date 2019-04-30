package PracticeGroupStudy;
import java.util.*;
public class HomeworkJavaVSPython {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	 String sentence = scan.nextLine();
	 int countJ = 0;
	 int countP = 0;
	 boolean jp = true;
	 for(int i = 0; i <sentence.length(); i++) {
		 if(sentence.substring(i, i+4).equals("java")) {
			 countJ++;
		 }
	 }
	
	 for(int i = 0; i <sentence.length()-5; i++) {
		 if(sentence.substring(i, i+6).equals("python")) {
			 countP++;
		 }
	 }
	
	if(countJ == countP) {
		jp = true;
	}else {
		jp = false;
	}
	
	
	System.out.println(jp);
	
	
}
}
