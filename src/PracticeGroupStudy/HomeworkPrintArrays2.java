package PracticeGroupStudy;
import java.util.Scanner;
public class HomeworkPrintArrays2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	
		String first = "";
		String output = "";
		for(int i = 0; i < words.length; i++) {
		
		first = words[i].substring(0, 1) + words[i].substring(words[i].length()-1);
		
		output += first + ", ";
		
	

	}	
	System.out.println("["+ output.substring(0, output.length()-2) +"]");
	
	}
}
