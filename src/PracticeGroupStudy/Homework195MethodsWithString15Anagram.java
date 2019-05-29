package PracticeGroupStudy;

public class Homework195MethodsWithString15Anagram {
	
	public static void main(String[] args) {
		String word1= "jaava";
		String word2= "java";
		System.out.println(isAnagram(word1, word2));
	}
	
	public static boolean isAnagram(String word1, String word2) {
	    //case and space insensitive
		//if each char is in the word2
		 boolean isAnagram = false;
		 
		 word1 = word1.toLowerCase();
		 word2 = word2.toLowerCase();
		 word1 = word1.replace(" ", "");
		 word2 = word2.replace(" ", "");
		 int count =0;
		 if(word1.length()==word2.length()) {
			 for(int i =0; i<word1.length();i++) {
				 if(word2.charAt(i)==(word1.charAt(i))){
					count++;
				 }
			 }
			 if(count == word1.length()) {
				 isAnagram = true;
			 }
		 }
		return isAnagram;
	  }
}
