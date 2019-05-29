package PracticeGroupStudy;

public class Homework94MethodswithStrings14 {

	 public static boolean isPalindrome(String check) {  //nurses run nur sesrun
		 check = check.replace(" ", "");
		 check = check.toLowerCase();
		 boolean isPalindrome = false;
		 String reverse ="";
		 for(int i =check.length()-1; i>=0 ;i--) {
			reverse+= check.charAt(i)+"";
		 }
		 System.out.println(reverse);
		 
		 
		 if(check.equals(reverse)) {
			 isPalindrome = true;
		 }
		 return isPalindrome;
	 	}
	 
	 public static void main(String[] args) {
		
		 String check = "noon";
		System.out.println(isPalindrome(check));
	}
}
