package PracticeGroupStudy;

import java.util.Scanner;

public class Utils {
	public static void main(String[] args) {
		
	
	Scanner scan  = new Scanner(System.in);
	
	System.out.println("Enter the word: ");
	String word = scan.next();
	int l = word.length()-1;
		String reverse = "";
		for(int i =0;i<word.length();i++) {
			Character ch = word.charAt(i);
			
		
			if(!ch.isAlphabetic(ch)) {
				reverse +=ch; 
			}else {
				
				for(int k = l; k >=0; k--) {
					Character rev = word.charAt(k);
					l--;
					if(Character.isAlphabetic(rev)) {
					reverse+=rev;
					
					break;
					}//..zxcv..d
				}
				
			}
		}
		System.out.println(reverse);
		//return word;
	}
}



//<----re[..,/]';]>
//<----re[ree..,/]';ee]>
