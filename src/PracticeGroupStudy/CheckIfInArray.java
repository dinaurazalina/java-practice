package PracticeGroupStudy;

public class CheckIfInArray {

	public static void main(String[] args) {
		
		ifPresent();
	}

	private static void ifPresent() {
		int n = 55;
		boolean present = false;
		int nums [] = {22,33,44,55,66,11,90};
		
		for(int num:nums) {
			if(num==n) {
				present = true;
			break;
			}
		}
	
		System.out.println("Is "+n+" present? - "+ present);
	}
}
