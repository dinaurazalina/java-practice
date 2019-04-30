package day22_practiceLoops;

public class SubstringPractice {
public static void main(String[] args) {
	String word = "java";
	int i = 0;
	System.out.println(word.substring(i,i+1));
	i++;
	System.out.println(word.substring(i,i+1));
	i++;
	System.out.println(word.substring(i,i+1));
	i++;
	System.out.println(word.substring(i,i+1));
	
	//print each character using substring
	System.out.println();
	
	for(int n = 0; n<=3; n++) {
		System.out.println(word.substring(n, n+1));
	}
	
	System.out.println("###########################");
	
	for(int n = word.length()-1; n >=0; n--) {
		System.out.println(word.substring(n, n+1));
	}
}
}
