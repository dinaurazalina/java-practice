package PracticeGroupStudy;
import java.util.Scanner;
public class homeworkMergethem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word1= scan.next();
		String word2 = scan.next();
		
	if(word1.length()==3 && word2.length()==3) {
		System.out.print(word1.charAt(0));
		System.out.print(word2.charAt(0));
		System.out.print(word1.charAt(1));
		System.out.print(word2.charAt(1));
		System.out.print(word1.charAt(2));
		System.out.print(word2.charAt(2));
	}else {
		System.out.println("cannot merge");
	}
	
	
	String word3 = scan.next();
	
	if (word3.length()== 5) {
		System.out.print(word3.charAt(word3.length()-1));
		System.out.print(word3.charAt(word3.length()-2));
		System.out.print(word3.charAt(word3.length()-3));
		System.out.print(word3.charAt(word3.length()-4));
		System.out.print(word3.charAt(word3.length()0));
		
	}else if(word3.length()>5) {
		System.out.println("Too long!");
		
	}else {
		System.out.println("Too short!");
	}
	
	
	}
}
