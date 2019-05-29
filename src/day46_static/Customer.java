package day46_static;

public class Customer {

	private String name;
	private String email;
	
	static int count;
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + "]";
	}
	public Customer() {
		name ="undefined";
		email = "undefined";
		count++;
	}
	public Customer (String name, String email) {
		setName(name);
		setEmail(email);
		count++;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName(String name) {
		return name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}

}
