package day15_string;

public class IndexOf2 {
	public static void main(String[] args) {
		
		String list = "html-selenium-angular-jenkins-grid";
		
		int firstDash = list.indexOf("-");
		System.out.println("FIrst dash: "+ firstDash);
		
		int secondDash = list.indexOf("-", 5);
		System.out.println("Second dash: "+ secondDash);
		
		int thirdDash = list.indexOf("-", secondDash +1);
		System.out.println("third dash "+ thirdDash);
		
		int fourthDash = list.indexOf("-", thirdDash +1);
		System.out.println("Fourth dash "+ fourthDash);

	
	//another method to find another dash
		
		int lastDash = list.lastIndexOf("-");
		System.out.println("The last dash " + lastDash);
	
		int lastI = list.lastIndexOf("i");
		System.out.println("The last letter I " + lastI);
	
	
	}
}
