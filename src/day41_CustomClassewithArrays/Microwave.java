package day41_CustomClassewithArrays;

public class Microwave {

	String brand;
	boolean isOn;//false
	
	public void turnOn() {
		if(isOn == false) {
			System.out.println("Turning on the "+ brand+" microwave...");
			isOn = true;
		}else {
			System.out.println("The microwave "+ brand+" is already on!");
		
		}
	}
	public void turnOff() {
		if(isOn) {
			System.out.println("Turning off the "+ brand+" microwave...");
			isOn = false;
		}else {
			System.out.println("The microwave "+ brand+"is already off!");
		}
	}
	
	public void heat(String food, int sec) {
		if(isOn) {
			System.out.println("Heating your "+food+ " for "+ sec+ " sec...");
		}else {
			System.out.println("Please turn on the microwave "+ brand+"first");
		}
	}
}
