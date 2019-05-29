package day42_customClassesEncapsulation;

public class Shoes {

	String brand;
	double size;
	
	public void setShoesData(String Nbrand, double Nsize) {
		brand = Nbrand;
		size = Nsize;
	}
	
	public String getShoesData() {
		String s = brand + "|" + size;
		return s;
	}
}
