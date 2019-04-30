package day35_review;

public class EncryptionFun {

	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		String word  = "easter";
		String encrypt = "";
		
		//get a char from word 
		//find indexOf the char in alphabet
		//read the char in alphabet 
		//read the char from encrypted at that index
		//add to some string
		
		
		char first = word.charAt(0);
		int position = alphabet.indexOf(first);
		char enChar = encrypted.charAt(position);
		System.out.println(first +" ---> "+ enChar);
		
		for(int i = 0; i< word.length();i++) {
			
			encrypt+=encrypted.charAt(alphabet.indexOf(word.charAt(i)));
		}

		System.out.println("\""+word +"\""+ " is being encrypted into "+"\""+encrypt+"\"");
	}
	
	
	
	
}
