package day42_customClassesEncapsulation;

public class Coffee {

	String name;
	String size;
	Double price;
	int calories;
	
public void printInfo(){
	
	System.out.println("Name of the coffee: ["+ name.toUpperCase() + "], Size: ["+ size.toUpperCase()+ "], Price: [$"
							+ price+ "]Calories: [" + calories+ " cal]");
}


public void setName(String newName) {
	
	name = newName;
	
}
public void setSize(String newSize) {
	
	if( newSize.equalsIgnoreCase("tall")||
		newSize.equalsIgnoreCase("grande")||
		newSize.equalsIgnoreCase("venti")) {
	size = newSize;
	}else {
		System.out.println("Error: Invalid Size - " + newSize);
	}
}
public void setPrice(double newPrice) {
	
	price = newPrice;
	
}
public void setCalories(int newCalories) {
	
	calories = newCalories;
	
}
public void setCoffeeInfo (String newName, String newSize, int newCal, double newPrice) {

	  name=newName;
	  
	 setSize(newSize);// we are calling another method for the current method
	  calories=newCal;
	  price=newPrice;
	  
	  
}
}
