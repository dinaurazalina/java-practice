package day41_CustomClassewithArrays;

public class Car {

	String make;
	String model;
	String color;
	int currentSpeed;

public void printCarInfo() {
	
	String info = ("car make ["+make+ "], model [" + model+ "], color ["+ color+"], currentspeed ["+currentSpeed+"]" );
	System.out.println(info);
}

public void showCurrentSpeed(int speedLimit) {
	if(currentSpeed<=speedLimit) {
		System.out.println(make + " is driving at "+ currentSpeed + " mph, following the speed limit - "+ speedLimit);
	}else {
		System.out.println(make + " is driving at "+ currentSpeed + " mph, over the speed limit - "+ speedLimit);
		
	}	
}
public void drive() {
	System.out.println(make +" is driving . . .");
}

public void accelerate(int speed) {
	currentSpeed+=speed;
	
}
}
