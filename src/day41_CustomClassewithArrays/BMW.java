package day41_CustomClassewithArrays;

public class BMW {

	String make = "BMW";
	String model;
	double price;
	
	public void showPrice() {
		switch(model) {
		case"330i":
		price = 40250;
		break;
		case"740i":
			price = 86450;
			break;
		case"m3":
			price = 66500;
			break;
		default:
			System.out.println("The model is not available");
		}
		System.out.println("The price for " + model +" model is - " + price);
	}
}
