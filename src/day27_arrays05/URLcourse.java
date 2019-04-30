package day27_arrays05;
import java.util.*;
public class URLcourse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter valid url:");
		String url = scan.next();
		
		String [] digits = url.split("/");
		
		int last = Integer.parseInt(digits[digits.length -1]);
		
		
		
		switch(last) {
		case 147:
			System.out.println("Java programming");
		break;
		case 204:
			System.out.println("Mentoring sessions");
		break;
		case 149:
			System.out.println("SDLC");
		break;
		case 152:
			System.out.println("QA Testing");
		break;
		case 144:
			System.out.println("Team activity");
		break;
		case 143:
			System.out.println("Welcome Kit");
		break;
		
		default: 
			System.out.println("Invalid url");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		//https://learn.cybertekschool.com/courses/149
	}
}
