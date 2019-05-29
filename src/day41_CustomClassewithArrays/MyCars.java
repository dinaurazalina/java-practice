package day41_CustomClassewithArrays;

public class MyCars {

	public static void main(String[] args) {

		Car miniCooper = new Car();
		miniCooper.make = "Mini Cooper";
		miniCooper.color = "white";
		miniCooper.model = "Mini Convertible";
		miniCooper.currentSpeed = 60;
		
		miniCooper.printCarInfo();
		miniCooper.showCurrentSpeed(55);
		miniCooper.drive();
		miniCooper.accelerate(20);
		miniCooper.showCurrentSpeed(35);
		
	}
}
