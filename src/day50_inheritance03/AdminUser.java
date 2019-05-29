package day50_inheritance03;

public class AdminUser extends slackUser{

	public AdminUser(String name) {
		super(name);
	}
	@Override
	public void sendAMessage(String msg) {
		System.out.println("@channel");
		System.out.println(getName() + " is sending a message <"+msg +">");
	}
	
	
}
