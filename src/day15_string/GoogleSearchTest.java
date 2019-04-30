package day15_string;

public class GoogleSearchTest {
public static void main(String[] args) {
	
	String item = "java";
	String pageTitle = item + " - Google Search";
	
	//test if PageTitle starts with item
	
	
	if(pageTitle.startsWith("java")) {
		System.out.println("PASSED: Page title check passed");
	}else {
		System.out.println("FAIL: Page title check failed");
	}
	
	
	if(pageTitle.endsWith("Google Search")) {
		System.out.println("PASSED: Page title check passed");
	}else {
		System.out.println("FAIL: Page title check failed");
	}
}
}
