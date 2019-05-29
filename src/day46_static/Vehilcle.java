package day46_static;

public class Vehilcle {

	String type;//instance variable, every object has its own type
	static int numberOfVehicles;// static /shared, one central value
	
	public static void vehicleInfo() {
	// System.out.println("type: "+ type);  <<it will not compile
	System.out.println("number of vehicle: "+ numberOfVehicles);
	
	int count = getNumberOfVehicles();	
	
	String make = "kia"; //local variable
	make = make.toUpperCase();
	System.out.println("make: "+ make);
	
	//System.out.println(toString()); static method cannot call non- static method
	
	Vehilcle vh = new Vehilcle();
	vh.toString(); //<< this is okay bc you create an object of the class
	
	}
	public static int getNumberOfVehicles() {
		return numberOfVehicles; //static variable inside static method
	}
	
	public String toString() { //non static method
		return "Vehicle type: "+ type + " | count: "+ numberOfVehicles;
	}
}
