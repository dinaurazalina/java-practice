package day15_string;

public class indexOf {
public static void main(String[] args) {
	String word1 = "github";
	System.out.println(word1.indexOf('t'));
	System.out.println(word1.indexOf("th"));
	System.out.println(word1.indexOf("hub"));
	
	System.out.println(word1.indexOf("java"));

	System.out.println(word1.charAt(0) + ""+ word1.charAt(3));
	String url = "www.okta.com";
	
	int index = url.indexOf(".");
	System.out.println("Position of . :" + index);
	System.out.println(url.charAt(index+ 1));
	
	
	
	String title = "Java - Google Search";

	int positionDash = title.indexOf("-");
	System.out.println(title.charAt(positionDash -1 ));
	System.out.println(title.charAt(positionDash +1 ));

	
	
	String country = "United States of America";
	int states = country.indexOf("States");
	System.out.println("position of the word Stated: "+ states);


	
	String word2 = "java, c++, python, tomcat, eclipse";
	if(word2.contains("c++")) {
		System.out.println("c++ is there");
	}else {
		System.out.println("c++ is not there");
	}
	
	int d = word2.indexOf("c++");
	System.out.println(d);
	
	
}
}
