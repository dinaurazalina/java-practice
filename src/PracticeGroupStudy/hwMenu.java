package PracticeGroupStudy;
import java.util.Scanner;
public class hwMenu {
	  public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
System.out.println("Enter seconds: ");
int inputSeconds = s.nextInt();

int hours = inputSeconds/3600 ;
int minutes = inputSeconds%60 - 60;
int seconds = inputSeconds/360 - 3600;
System.out.println(hours +" hours, ");
System.out.println(minutes +" minutes, ");
System.out.println(seconds +" seconds");
}
}