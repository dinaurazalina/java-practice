package PracticeGroupStudy;

public class Homework179MethodswithString11 {

	public static void main(String[] args) {
		System.out.println(reverse("student"));
	}
	public static String reverse(String input) {
		String reverse = "";
		//foo > oof
		for(int i = input.length()-1; i >= 0; i--) {
			reverse += input.charAt(i)+"";
		}
		return reverse;
		
		
	}
}
