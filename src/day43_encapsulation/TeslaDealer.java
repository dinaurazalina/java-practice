package day43_encapsulation;

public class TeslaDealer {

	public static void main(String[] args) {
		
		Tesla tesla = new Tesla();
		tesla.setModel("Model S");
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setPrice(51450);
		tesla.setIsSelfDriving(true);
		
		
		System.out.println("Model: " + tesla.getModel());
		System.out.println("Range: " + tesla.getRange());
		System.out.println("Zero to 60: " + tesla.getZeroTo60());
		System.out.println("Is it self driving car? "+ tesla.isSelfdriving());
		System.out.println("________________________________________");
		System.out.println("Your total: ");
		System.out.println("          $"+ tesla.getPrice());
	
	System.out.println(tesla);//it automatically calling toString() method
	System.out.println(tesla.toString());
	
	
	
	Tesla myTesla = new Tesla();
	myTesla.setTeslaInfo("Roadster", 620, 250000, 1.9, true);
	System.out.println(myTesla.toString());
	
	if(tesla.getZeroTo60() > myTesla.getZeroTo60()) {
		System.out.println("My Tesla "+myTesla.getModel() +" is faster");
		System.out.println("0 - 60 speed: " + myTesla.getZeroTo60());
	}else {
		System.out.println("Tesla Model S "+ tesla.getModel()+" is faster");
		System.out.println("0 - 60 speed: " + tesla.getZeroTo60());
	}
	
	
	
	buy(myTesla);
	System.out.println(testDrive("Model S"));
	Tesla testCar = testDrive("Model 3");
	System.out.println(testCar.toString());
	}



	public static void buy(Tesla car) {
		System.out.println("Purchasing: "+ car.toString());
	}
	
	
	public static Tesla testDrive (String model) { //instead of void we put Tesla class
		
		System.out.println("- I would liek to test drive - " + model);
		System.out.println("- Sure, let me build the object and return it");
		Tesla car1 = new Tesla();
		car1.setTeslaInfo(model, 310, 95000, 2.5, false);
		return car1; //we are returning tesla object and it matches returning type
		
	}
	
	
}
