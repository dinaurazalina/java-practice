package day49_inheritance_02;

public class Leopard extends Animal{

	public Leopard () {
		super(); //call parent class with no args
		System.out.println("Leopard constructor");
		 setType("Leopard");
	}
	
	public Leopard(String type) {
		super(type);//call Animal (String type) constructor
		System.out.println("Leopard 1 args constructor");
	}
}
