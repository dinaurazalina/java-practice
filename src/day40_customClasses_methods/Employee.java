package day40_customClasses_methods;

public class Employee {
String name;
String jobTitle;
double salary;

public void work(){
	System.out.println(name +" is coding... coding");
}
public void goToBreak() {
	System.out.println(name + " is drinking coffee and chatting ...");
}
public void attendMeeting() {
	System.out.println(name + " talking to other employees. Daily scrum, Demo and Retro");
}
public void introduce() {
	System.out.println("Name ["+ name + "], job title ["+ jobTitle + "], salary ["+ salary+"]");
}

}
