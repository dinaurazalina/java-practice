package day46_static;

public class ebay {

	
	public static void main(String[] args) {
		Customer cm1 = new Customer("Abdallah Aleies", "Abdallah_Aleies@gmail.com");
		Customer cm2 = new Customer("Adilet Kyrgyz", "adilet_kyrgyz@yahoo.com");
		Customer cm3 = new Customer("Anastasia Zasibna", "anastasia_z@gmail.com");
	
	System.out.println(cm3.count);
	System.out.println(Customer.count);
	
	Customer cm4 = new Customer("Burak Ucal", "burak@yahoo.com");
	System.out.println("Total Customer: "+ Customer.count);
	
	cm1.count = 10;
	System.out.println(cm3.count);
	
	System.out.println(cm1.toString());
	System.out.println(cm2.toString());
	System.out.println(cm3.toString());
	System.out.println(cm4.toString());
	}
}
