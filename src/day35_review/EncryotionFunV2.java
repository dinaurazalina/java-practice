package day35_review;

public class EncryotionFunV2 {
/*
 *encryptChar
 *return type: char
 *param : char
 *takes a char and returns encrypted version
 *encryptChar('a') ==> 'z';
 */

	public static void main(String[] args) {
		
		System.out.println("Encrypted version of letter \"d\" is " + encryptChar('d'));
	
		System.out.println(encryptedWord("dina"));
		
		System.out.println(encryptSentence("my name is dina"));
		System.out.println(encryptSentence("i love java"));
		
		//glwzb*dzh*z*tivzg*wzb*zmw*dv*xlwvw*qzez
		System.out.println(decryptedWord("gszmp*blf*nfilwro"));
		
	}
	
	public static char encryptChar (char enc) {
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		
		
		char enChar = encrypted.charAt(alphabet.indexOf(enc));
		
		
		return enChar;
	}
	
	public static String encryptedWord(String word) {
		String word2 = "";
		for(int i =0; i < word.length();i++) {
		 word2 += encryptChar(word.charAt(i));
				}
		return word2;
	}

	/*
	 * encryptSentence 
	 * return type : String 
	 * param: String sentence
	 * Split the sentence by space and call encryptedWord
	 * return encrypted sentence 
	 * 
	 */
	
	public static String encryptSentence (String sentence) {
		
		String [] wordsArr = sentence.split(" ");
		String returnValue = "";
		for(String word : wordsArr) {
			returnValue +=encryptedWord(word)+" ";
		}
		
	
		return returnValue.trim();
	}
	
	
	public static String decryptedWord(String word) {
		String decryptedW ="";
		String alphabet = "abcdefghijklmnopqrstuvwxyz ";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba*";
		
		for (int i = 0; i < word.length(); i++) {
			decryptedW	+=alphabet.charAt((encrypted.indexOf(word.charAt(i))));
		}
		return decryptedW;
	}
	
}

