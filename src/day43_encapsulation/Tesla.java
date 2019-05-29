package day43_encapsulation;

public class Tesla {

private	String model;
private	int range;
private double zeroTo60;
private double price;
boolean isSelfDriving;



public String toString() {
	return "Tesla [model=" + model + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price=" + price
			+ ", isSelfDriving=" + isSelfDriving + "]";
}
public void setModel(String model) {
	if(isValidModel(model)) {
	this.model = model;
		}else {
	this.model = "Unknown";
		}
}
public String getModel() {
	return model;
}

public void setRange(int range) {

	this.range = range;
}
public int getRange() {
	return range;
}

public void setZeroTo60(double zeroTo60) {
	this.zeroTo60= zeroTo60;
}
public double getZeroTo60() {
	return zeroTo60;
}

public void setPrice(double price) {
	this.price = price;
}
public double getPrice() {
	return price;
}
public void setIsSelfDriving(boolean isSelfDriving) {
	this.isSelfDriving = isSelfDriving;
}
public boolean isSelfdriving() {
	return isSelfDriving;
}

public boolean isValidModel(String model) {
	if(model.equalsIgnoreCase("Model S") || model.equalsIgnoreCase("Model 3")
		||model.equalsIgnoreCase("Model X")||model.equalsIgnoreCase("Model Y")
		||model.equalsIgnoreCase("Roadster")) {
		return true;
	}
	else {
		return false;
	}
	
	// or
	
//	return model.equalsIgnoreCase("Model S")|| 
//		   model.equalsIgnoreCase("Model 3")|| 
//		   model.equalsIgnoreCase("Model X")||
//		   model.equalsIgnoreCase("Model Y")||
//		   model.equalsIgnoreCase("Roadster");
	
	//or
//	
//	switch(model.toLowerCase()) {
//	case "Model S":
//	case "Model 3":
//	case "model x":
//	case "model y":
//	case "roadster":
//		return true;
//	default:
//		return false;
//	}
}



public void setTeslaInfo(String model, int range, double price, double zeroTo60, boolean isSelfDriving) {
	setModel(model); setRange(range); setPrice(price); setZeroTo60(zeroTo60); setIsSelfDriving(isSelfDriving);
}

}
