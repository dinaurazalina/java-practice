package day50_inheritance03;

public class TestAnimals {

	public static void main(String[] args) {
		Animals an = new Animals();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Duck duck = new Duck();
		an.speak();
		cat.speak();
		dog.speak();
		duck.speak();
		
		an.move(20);
		cat.move(201);
		dog.move(400);
		duck.move(3);
	
	}
}
