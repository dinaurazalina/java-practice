package day42_customClassesEncapsulation;

public class StarbucksCoffee {

	public static void main(String[] args) {
		Coffee c1 = new Coffee();
		c1.name = "ULTRA CARAMEL FRAPPUCCINO";
		c1.size = "tall";
		c1.calories = 350;
		c1.price = 4.95;
		
		c1.printInfo();
		
		
		Coffee coffee2 =new Coffee();
		coffee2.setName("Java chip");
		coffee2.size = "Venti";
		coffee2.calories = 600;
		coffee2.price = 5.95;
		coffee2.printInfo();
	
		
		Coffee coffee3 = new Coffee();
		coffee3.setName("Strawberry Acai");
		coffee3.setCalories(90);
		coffee3.setSize("Grande");
		coffee3.setPrice(3.95);
		
		System.out.println("coffee3 name: "+ coffee3.name);
		coffee3.printInfo();
	
	
	
		Coffee coffee4 = new Coffee();
		coffee4.setCoffeeInfo("Flat White", "Tall", 170, 3.95);
		coffee4.printInfo();
	
	
	
	
	}
}
