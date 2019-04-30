package PracticeGroupStudy;
import java.util.*;
public class CodingBatWarmUpStringMatch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next(), b =scan.next();
		//hello, he >>> 1
		int count  =0;
		//find out which string is shorter 
		
		int length = Math.min(a.length(), b.length());
		
		// for loop in order to find if part of those strings match 
		//declare String aSub and bSub so my code is not too messy
		
		for(int i= 0; i< length-1; i++) {
			String aSub = a.substring(i, i+2);
			String bSub = b.substring(i, i+2);
			
			if(aSub.equals(bSub)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
