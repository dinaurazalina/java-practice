package day15_string;

public class StartsEndsWith {
public static void main(String[] args) {
	
	String word1 = "eclipse";
	
	System.out.println(word1.startsWith("e"));//true
	System.out.println(word1.startsWith("eclipse"));//true
	
	System.out.println(word1.startsWith("Ec")); //false bc its CaseSensitive

	System.out.println(word1.endsWith("e")); //true
	System.out.println(word1.endsWith("eclipse")); //true

	
	//"PSE"
	System.out.println(word1.toUpperCase().endsWith("PSE")); //true

	//Mr. ==> male with last name 
	//Mrs. ==> married female
	//Ms. ==> single woman
	//Dr. ==> doctor man/ woman
	
	String word2 = "Mr. Jackson";
	
	if(word2.startsWith("Mr.")) {
		System.out.println("male with last name");
	}else if(word2.startsWith("Mrs.")) {
		System.out.println("married female");
	}else if(word2.startsWith("Ms.")) {
		System.out.println("not married female");
	}else if(word2.startsWith("Dr.")) {
		System.out.println("doctor man/ woman");
	}else {
	System.out.println("unknown status");
	}
}
}






