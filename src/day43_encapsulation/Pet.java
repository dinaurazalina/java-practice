package day43_encapsulation;

public class Pet {

	private String type;
	private String name;
	
	public Pet(String type, String name) {
		this.type = type;
		this.name = name;
	}
	public void speak() {
	switch(type.toLowerCase()) {
	case "cat":
		System.out.println("Meow");
		break;
	
	case "dog":
		System.out.println("woof woof");
		break;
	case "bird":
		System.out.println("chik chirik");
		break;
	case "goat":
	case "sheep":
		System.out.println("baaaa baaaa");
	case "rooster":
		System.out.println("ku ka re ku");
		default:
			System.out.println("...");
			break;
	}
	}
	
	public Pet() {
		System.out.println("No args constructor");
	}
	public String toString() {
		return "Pet [type=" + type + ", name=" + name + "]";
	}
	public void getType(String type) {
		this.type = type;
	} 
	public String setType() {
		return type;
	}
	public void getName(String name) {
		this.name= name;
	}
	public String setName() {
		return name;
	}
}
