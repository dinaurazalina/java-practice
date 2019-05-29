package day40_customClasses_methods;

public class Contact {
String name;
String phoneNumber;
String email;

public void call(){
	System.out.println("Calling "+ name);
}
public void sendMsg() {
	System.out.println("Sending message to " + name +" to " + phoneNumber);
}
public void sendEmail() {
	System.out.println("Sending email to "+ name + " to " + email);
}
}
