package PracticeGroupStudy;

public class Homework159MethodsWithReturn4ProfitOrLoss {

	public static String c_profits (int buyPrice, int sellPrice) {
		if(buyPrice> sellPrice) {
			return "profit";
		}else if(buyPrice< sellPrice) {
			return "loss";
		}else{
			return "no loss";
		}
	}
}
