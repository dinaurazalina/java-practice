package day30_methods02;

public class EtsyClass {
public static void main(String[] args) {
	navigateToEtsy();
	searchForWoodenSpoon();
	printResults();
	
}


public static void navigateToEtsy() {
	System.out.println("Launching Chrome browser");
	System.out.println("navigating to www.etsy.com");
}

public static void searchForWoodenSpoon() {
	System.out.println("Type <Wooden Spoon> into Search field");
	System.out.println("Clcik on Search button");
	System.out.println("searching For < Wooden Spoon >");
}

public static void printResults() {
	System.out.println(" \"Wooden Spoon\" (14 348 results)");
}
}
