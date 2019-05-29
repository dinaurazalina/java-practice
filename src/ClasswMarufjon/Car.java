package ClasswMarufjon;

public class Car {

	private	String make, model, price;
	
	public Car(String make, String model, String price) {
		this.make = make;
		this.model = model;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	
	public String getModel() {
		return model;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}
