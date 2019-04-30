package day06_operators2;

public class ShortHandOperators {
	public static void main(String[] args) {
		
		int students = 45;
		System.out.println("Students:" + students );
		students = students +5;
		System.out.println("Students:" + students );
		students = students - 2;
		System.out.println("Students:" +students);
		
		
		
		//using ShortHand0perators:
		
		
		int teachers = 10;
		System.out.println("Teachers: " + teachers);
		teachers+= 2;
		System.out.println("Teachers: " + teachers);
		
		//teachers = teachers -5;
		
		teachers-= 5;
		System.out.println("Teachers: " + teachers);
		
		
		
		System.out.println();
		
		int cars = 12;
		System.out.println(cars);
		
		cars *= 2; // cars = cars *2;
		
		System.out.println(cars);
		
		cars += cars;
		System.out.println(cars);
		
		
		
		
		int shoes = 20;
		shoes /= 4; //shoes = shoes/4
		System.out.println(shoes);
		
		
		
		double price = 45.50;
		int amount = 5;
	
		price += amount;
		System.out.println(price);
		
		
		int minutes = 66;
		minutes %=60;  //minutes = minutes%60; <<= we put 60 because there 60 mins in an hour
		System.out.println("Remaining: " + minutes);
		
		
		int pennies = 550;
		pennies %= 100; //pennies = pennies%100 <<= there are 100 pennies in a dollar
		
		System.out.println("Pennies left: " + pennies);
	
		
		
		//but
		
		int apples = 10;
		apples = -3;
		System.out.println(apples); // =>> it will show you -3, bc you're reassigning a new value to the variable
	
	
		
		
		//Increment
		
		int count = 1;
		count = count + 1; //2
		count += 1; //3
		count++; //4
		
		
		
		
		
		
		
	
	
	}

}
