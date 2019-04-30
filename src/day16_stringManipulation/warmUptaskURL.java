package day16_stringManipulation;
import java.util.Scanner;
public class warmUptaskURL {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter your website");
	String url = scan.nextLine();
	
	
	if (url.startsWith("www.")) {
		System.out.println("Starts with www");
	}else {
		System.out.println("Invalid url");
		return;
	}
	
	
	char dot = url.charAt(url.length()-4);	
	// = url.charAt(url.length(".")
	

	if(dot =='.') {
			System.out.println(". is there before extension");
	}else {
		System.out.println(". might be misplaced");
	}
	
	//get domain and extension
	
		String domain = url.substring(4, url.length()-4);
		System.out.println("domain: " + domain);
		String extension = url.substring(url.length()-3, url.length());
	
		System.out.println("extension: " + extension
				);
	
}
}
