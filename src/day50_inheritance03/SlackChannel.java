package day50_inheritance03;

public class SlackChannel {
public static void main(String[] args) {
	

	slackUser su = new slackUser("Nadir");
	AdminUser au = new AdminUser("Florian");
	
	su.sendAMessage("If you’re new to automated testing, you’re probably starting off with a lot of questions: How do I know which tests to automate? Why is automated testing useful for me and my team? How do I choose a tool or framework? ");
	au.sendAMessage("Thank you");
}
}
