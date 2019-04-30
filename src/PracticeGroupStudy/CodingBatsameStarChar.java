package PracticeGroupStudy;

public class CodingBatsameStarChar {

	public static void main(String[] args) {
		
		String  str = "xy*yzz";
		boolean bo = false;
		
		int starCount = 0;
		int boCount = 0;
		
		for (int i = 1; i < str.length(); i++) {
			if(str.indexOf("*", i)>= i && str.indexOf("*", i) < str.length()-1) {
				i = str.indexOf("*", i);
				starCount++;
			if(str.charAt(i-1)== str.charAt(i+1)) {
				boCount++;
				}
			}
		}
		if(starCount == boCount) {
			bo = true;
			}
		System.out.println(bo);
	}
	
}
