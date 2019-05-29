package day40_customClasses_methods;

public class MyCOntact {

	public static void main(String[] args) {
		
		Contact contact1 = new Contact();
		contact1.name  = "Evgenia Jalilova";
		contact1.phoneNumber = "(202) 333-4444";
		contact1.email = "evgenia@thorlabs.com";
		
		contact1.call();
		contact1.sendMsg();
		contact1.sendEmail();
		
		Contact orhan = new Contact();
		orhan.name ="Orhan Sultanov";
		orhan.phoneNumber = "(571) 991-2323";
		orhan.email = "orhan@gmail.com";
				
		System.out.println("Name: "+ orhan.name);
		System.out.println("Phone number: "+ orhan.phoneNumber);
		System.out.println("Email " + orhan.email);
		
		orhan.call();
		orhan.sendEmail();
		orhan.sendMsg();
	}
}
