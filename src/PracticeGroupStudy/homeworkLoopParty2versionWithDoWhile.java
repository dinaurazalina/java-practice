package PracticeGroupStudy;
import java.util.Scanner;
public class homeworkLoopParty2versionWithDoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String name = "";
		String yesNo = "";
		String guestName = "";
		do {
			System.out.println("Please enter guest name:");
			name = scan.next();
			System.out.println("Do you want to enter new guest name:");
			yesNo = scan.next();
			guestName = guestName + name + ", ";
		}while (yesNo.equalsIgnoreCase("Yes"));
		
		System.out.println("Guest list: " + guestName.substring(0, guestName.length()-2));
		
		
		
		
		
		
		
		
	}
}
