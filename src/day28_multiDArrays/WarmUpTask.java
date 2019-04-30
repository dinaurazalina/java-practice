package day28_multiDArrays;
import java.util.*;
public class WarmUpTask {

	public static void main(String[] args) {
		//Reversing the sentence
		
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		
		String [] reverse = sentence.split(" ");
		String  reverse1 = "";
		for(int i = reverse.length-1; i >=0; i--) {
			reverse1 += reverse[i] + " ";   
		}
		
		String [] reverse2 = reverse1.split(" ");
		System.out.println(Arrays.toString(reverse2));
		
		System.out.println("************************");
		
		String sentence1 = scan.nextLine();
		String [] reverseD = sentence1.split(" ");
		int k=0;
		String temp = "";
		for(int i = reverseD.length-1; i>=k; i--, k++) {
			temp = reverseD[i];
			reverseD[i] = reverseD[k];
			reverseD[k] = temp;	
		}
		
		System.out.println(Arrays.toString(reverseD));
		
		
		
		
		
	}
}
