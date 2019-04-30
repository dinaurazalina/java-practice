package PracticeGroupStudy;
import java.util.Scanner;

  
public class mikeSmith {
public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	 System.out.println("enter ");
	    String message = scan.nextLine();
	    String sender;
	    String phoneNumber;
	    String messageBody;
	    

	    int doti = message.indexOf(">");
	     int doti1 = message.indexOf("<");
	    sender  = message.substring(doti1 + 1, doti);
	    System.out.println("Sender: " + sender);
	     int colon = message.indexOf(":", 10);
	     int dot2 = message.lastIndexOf(".");
	     phoneNumber = message.substring(colon +2, dot2 - 1);
	     System.out.println("Phone Number: " + phoneNumber);
	     
	     int braces = message.indexOf("{");
	     int braces2 = message.indexOf("}");
	     
	     messageBody = message.substring(braces +1, braces2);
	     
	     System.out.println("Message body: " + messageBody);
	     
	     
	     
	     //or better code 
	     
	     
	      sender = message.substring(message.indexOf("<")+1 , message.indexOf(">"));
	     System.out.println(sender);
	     phoneNumber = message.substring(message.indexOf("[")+1 , message.indexOf("]"));
	     System.out.println(phoneNumber);
	     messageBody = message.substring(message.indexOf("{")+1, message.indexOf("}"));
	     System.out.println(messageBody);

}
}
