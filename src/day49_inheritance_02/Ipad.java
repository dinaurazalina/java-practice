package day49_inheritance_02;
import day49_inheritance.device;
			//ipad IS- A device.IPad subclass in a different package
public class Ipad extends device {

	public void readEBook(String title) {
		System.out.println("Reading a book" + title + " using " + brand + " tablet");
		System.out.println("Model: "+ model);//it is working bc is it protected > it is subclass even tho it is in different classes
		// System.out.println("Price "+ price); < it is not working bc it is default > only work in the same package
		// System.out.println("Made in "+ country); < < not visible, cuz its private
	}
}
