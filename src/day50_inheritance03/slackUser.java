package day50_inheritance03;

public class slackUser {

	private String name;
	
	public slackUser(String name) {
		this.name = name;
	}
	
	public void sendAMessage(String msg) {
		System.out.println(name + " is sending a message <"+msg +">");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
