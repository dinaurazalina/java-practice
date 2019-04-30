package day13_ternary_strings_intro;

public class Ternary {

	public static void main(String[] args) {
		String result;
		int score = 95;
//		if (score > 60) {
//			result = "pass";
//		}else {
//			result = "fail";
//	
//		}
	
	
	result = score >60 ? "pass" : "fail";
	
	System.out.println("Result: " + result);
	
	
	String quality = "bad";
	int rating = (quality.equals("good")) ? 100 : 0;
	System.out.println("Rating: " + rating);
	
	
	int PMhour = 1;
	
	boolean rushHour = (PMhour >= 4 && PMhour <=7) ? true : false;  
	
	System.out.println(PMhour +" is rush hour? "+ rushHour);
	
	
	String result1 = rushHour == true ? "yes" : "no";
	
	System.out.println(PMhour +" pm is rush hour? "+ result1);
	
	
	
	
	
	
	int AMhour = 13;
	String amRushHour = (AMhour >= 6 && AMhour <= 9) ? "yes": "no";
	System.out.println(AMhour + " am is rush hour? " + amRushHour);
	
	}
	
	
	
}
