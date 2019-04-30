package PracticeGroupStudy;

public class CodingBatString2xyzMiddle {

	public static void main(String[] args) {
		
		String str = "AAxyzbu00";
		
		boolean bo = false;
		int i = 0;

			if(str.length() >5 && str.length()%2==0){ //even nums
				i = str.length()/2; 
				if(str.substring(i-1, i+2).equals("xyz") || str.substring(i -2, i+1).equals("xyz")) {
					bo = true;
				}
			}else if(str.length() > 4) {
				i = str.length()/2;
				
				if(str.substring(i-1, i+2).equals("xyz")) {
					bo = true;
				}
			}else if(str.length()>2 && str.contains("xyz")) {
				bo = true;
			}
		
		
		
		
		
		System.out.println(bo);
		
	}
}
