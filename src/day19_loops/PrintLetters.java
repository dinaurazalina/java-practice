package day19_loops;

public class PrintLetters {
	public static void main(String[] args) {
		
		String word = "Amazon";
		
		//print each characters one by one in separate lines
	int idx = 0;
	
	while (idx < word.length()) {
		System.out.println(word.charAt(idx));
		idx++;
	}
	
	//print each character in reverse order
	
	
	int idx2 = word.length()-1;
	
	while (idx2 >= 0) {
		System.out.println(word.charAt(idx2));
		idx2--;
	}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
