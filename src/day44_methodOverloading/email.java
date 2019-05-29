package day44_methodOverloading;

public class email {
	String message;
	public email(String message) {
		System.out.println("Sending email with message: "+ message);
		this.message = message;
	}
	
}
