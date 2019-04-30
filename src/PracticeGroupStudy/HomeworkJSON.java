package PracticeGroupStudy;
import java.util.Scanner;
public class HomeworkJSON {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	String json = scan.nextLine();

	int idxFirstName = json.indexOf(": \"", json.indexOf("firstName"));
	int idxFirstNameEnd = json.indexOf("\",", json.indexOf("firstName")+1);
	
	int idxLastName = json.indexOf(": \"", json.indexOf("lastName"));
	int idxLastNameEnd =json.indexOf("\",", json.indexOf("lastName")+1);
	
	
	System.out.print("First name: ");
	System.out.println(json.substring(idxFirstName +3, idxFirstNameEnd));
	System.out.print("Last name: ");
	System.out.println(json.substring(idxLastName+3,idxLastNameEnd ));
}
}
