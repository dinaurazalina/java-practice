package day16_stringManipulation;

public class extraEnd {
	public static void main(String[] args) {
		
		String str = "selenime";
		String result = "";
		if (str.length() == 2) {
			System.out.println(str + str + str);
		}else {
			result = str.substring(str.length() - 2);
			System.out.println(result + result + result);
		}
	}
}
