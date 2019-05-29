package day41_CustomClassewithArrays;

public class MyBMW {

	public static void main(String[] args) {
		
		BMW myBMW = new BMW();
		System.out.println(myBMW.make);
		myBMW.model  = "740i";
		myBMW.showPrice();
		
		
		BMW bmw2 = new BMW();
		bmw2.model = "x8";
		bmw2.showPrice();
	}
}
