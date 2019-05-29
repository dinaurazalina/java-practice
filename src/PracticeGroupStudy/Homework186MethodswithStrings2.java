package PracticeGroupStudy;

public class Homework186MethodswithStrings2 {

	public static void main(String[] args) {
		String s = "a2";
		System.out.println(extractNum(s));
	}
	
	public static String extractNum(String s) {
		String extraNum="";
	for(int i =0; i<s.length(); i++) {
		Character ex = s.charAt(i);
		if(Character.isDigit(ex)) {
			extraNum+=ex;
		}
	}
		return extraNum;
	}
}
