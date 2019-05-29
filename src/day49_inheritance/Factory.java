package day49_inheritance;

public class Factory {
//Factory is not a subclass, but it is in the same package
	public static void main(String[] args) {
		device dev = new device ();
		dev.brand = "LG";
		dev.model = "3300";
		dev.price = 1000;
	//	dev.country = "USA"; < not visible, cuz its private
	}
	
}
