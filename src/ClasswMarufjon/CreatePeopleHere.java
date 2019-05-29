package ClasswMarufjon;

public class CreatePeopleHere {

	public static void main(String[] args) {
		//when we use constructor certain actions are 
		//being taken during the process of 
		//creating the object
		Person john = new Person("01/01/2000");
		
		john.setFirstName("John");
		john.setLastName("Doe");
		
		
		System.out.println(john.getFirstName());
		System.out.println(john.getLastName());
		System.out.println(john.getBirthday());
		
		
		john.setLastName("Snow");

		
	}
}
