package day26_Arrays;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		
		String words = "Java,kava,html,selenium";
		String [] myWords = words.split(",");
		System.out.println("Count: " + myWords.length);
		System.out.println(myWords[1]); //kava
		System.out.println(myWords[2]);	//html
		
		System.out.println(Arrays.toString(myWords)); //all words as a String
		
		
		String diceResult = "1 - 20 of 1,461 positions";
		//print "1,461" 
		String [] arrayDice = diceResult.split(" ");
		System.out.println(arrayDice[4]);
		
		String [] arrayDice1 = diceResult.split("of");
		System.out.println(arrayDice1[0].trim());
		System.out.println(arrayDice1[1].trim());
		System.out.println("**************************");
	
	
	
		String sentence= "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		String [] allWords = sentence.split(" ");
		for(String a : allWords) {
			System.out.println(a);
		}
		System.out.println("**************************");
		String [] happy = sentence.split("happy");
		for(String ha : allWords) {
			System.out.println(ha);
		}
		System.out.println("**************************");
		String [] iSplit = sentence.split("I");
		for(String i: allWords) {
			System.out.println(i);
		}
		
		
		
		System.out.println("**************************");
		String word = "java";
		char [] charsArray = word.toCharArray();
		for(char c: charsArray) {
			System.out.println(c);
		}
		
	}
}
