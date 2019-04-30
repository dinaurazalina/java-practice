package PracticeGroupStudy;
import java.util.Scanner;
public class homeworkMiddleOne {

	public static void main(String[] args) {
		
	char middleL = 'o';
	char middleLE = 'e';
	char middleLE2 = 'r';
	
	Scanner scan = new Scanner(System.in);
	System.out.println("enter a word");
	String word = scan.next();

	if(word.length()%2 == 1) {
		if(word.length() >=3) {
	middleL = word.charAt(word.length()/2);
	System.out.println(middleL);
		}else {
			System.out.println(word+ word + word);
		}
	}else {
	if(word.length() >=4)	{
		middleLE = word.charAt(word.length()/2-1);
		middleLE2 = word.charAt(word.length()/2);
		System.out.print(middleLE);
		System.out.println(middleLE2);
	}else {
		System.out.println(word+ word);
		
	}
		
	}
}
}
