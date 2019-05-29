package day44_methodOverloading;

public class WhatsApp {

	private String toNumber;
	private String message;
	private boolean delivered;
	
	public WhatsApp() {
	
		System.out.println("No args constructor");
	}
	
	public WhatsApp(String toNumber, String message) {
		this();
		System.out.println("2 args constructor");
		
		this.toNumber = toNumber;
		this.message = message;
	}
	
	public WhatsApp(String toNumber) {
		//toNumber, "unknown";
		
		this(toNumber, "[]");
		System.out.println("one arg constructor");	
	
	}
	
	
	
	public String getToNumber() {
		return toNumber;
	}
	public void setToNumber(String toNumber) {
		this.toNumber = toNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isDelivered() {
		return delivered;
	}
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	
	
}
