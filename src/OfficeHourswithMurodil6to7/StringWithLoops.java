package OfficeHourswithMurodil6to7;
import java.util.*;
public class StringWithLoops {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day of the week: ");
		String day = scan.next();
		//check number of character
		
		System.out.println(day.length());
		if(day.length()>=6) {
			System.out.println("Possibly a valid day");
		}else {
			System.out.println("Days are normally 6 characters or longer");
		}
		
		
		String today  ="Monday";
		if(day.equals(today)) {
			System.out.println(today +" is today!");
		}
		
		
		
	}
}
