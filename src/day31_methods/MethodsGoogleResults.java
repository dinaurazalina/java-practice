package day31_methods;

public class MethodsGoogleResults {
	public static void main(String[] args) {
		
	
	String result = "About 121,000,000 results (0.75 seconds)";
	
	googleSearchResult(result);
	
	
	}
	public static void googleSearchResult(String result) {
		
	String [] arr = result.split(" ");
	
	System.out.println("Results count: "+ arr[1].replace(",", " "));
	System.out.println("Time in seconds: " + arr[3].replace("(", ""));
		
	}
}
