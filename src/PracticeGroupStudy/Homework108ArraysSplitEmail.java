package PracticeGroupStudy;
import java.util.*;
public class Homework108ArraysSplitEmail {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String email = input.nextLine();
		int count = 0;
		for (int i = 0; i< email.length(); i++) {
			if(email.charAt(i)==('@')) {
				count++;
	}
}
		if(count >=2 || count ==0) {
			System.out.println("invalid email");
		}else {
			String [] separator = email.split("@");
			
		for(int i = 0; i < separator.length; i++) {
			System.out.println("Email id: "+separator[i]);
			System.out.println("Email domain: "+separator[i+1]);
			break;
		}	
		
		}
			
			
			
		
	
	
	
	
	}
}
