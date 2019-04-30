package PracticeGroupStudy;

import java.util.Scanner;

public class HomeworkLoopsParty {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = "";
		String yesNo = "yes";
		String guestName = "";
		while (yesNo.equalsIgnoreCase("Yes")) {
			System.out.println("Please enter guest name:");
			name = scan.next();
			System.out.println("Do you want to enter new guest name:");
			yesNo = scan.next();
			guestName = guestName.concat(name).concat(", ");
		}
		System.out.println("Guest's list: " + guestName.substring(0, guestName.length() - 2));
	}
}
