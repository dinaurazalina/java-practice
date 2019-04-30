package PracticeGroupStudy;

public class Homework160MethodsWithReturn5HamletLogic {

	public static boolean hamletQuote (boolean toBe, boolean notToBe) {
		if(toBe == true &&notToBe == true ) {
			return true;
		}else if(toBe == true &&notToBe == false ) {
			return true;
		}else if(toBe == false &&notToBe == true ) {
			return true;
		}else {
			return false;
		}
	}
}
