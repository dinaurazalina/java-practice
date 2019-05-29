package day50_inheritance03;


public class Dog extends Animals{

	public void speak() {
		System.out.println("Dog is speaking woof woooof");
	}
	public void move(int steps) {
		System.out.println("Dog is moving "+ steps+ " steps");
	}
}
