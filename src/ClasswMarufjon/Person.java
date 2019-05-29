package ClasswMarufjon;

public class Person {

	private String firstName;
	private String lastName;
	private String birthday;
	
	
	//the constructor
	
	//the constructor takes an argument , we are assigning the argument to 
	//birthday, so from now on you have to provide bday whenever you create a person
	//and we will not have setBirthday method
	//bc people should not be able to change bday
	//logically you cannot keep changing bdays
	
	public Person(String bDay) {
		System.out.println("constructing");
		birthday = bDay;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthday() {
		return birthday;
	}
	
}
