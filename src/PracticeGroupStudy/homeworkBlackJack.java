package PracticeGroupStudy;
import java.util.Scanner;
public class homeworkBlackJack {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	
	int house, player;
	
	System.out.println("Enter player score: ");
	player = scan.nextInt();
	System.out.println("Enter house score: ");
	house = scan.nextInt();
	
	if(player >= 21) {
		System.out.println("bust");
	}else if(house > player) {
		System.out.println("player loss");
	}else if(house == player) {
		System.out.println("its a tie");
	}else if(player > house) {
		System.out.println("player wins");
		
		
		
		
		
		
	String in = scan.next();
	
	if(in.equalsIgnoreCase("burger") || in.equalsIgnoreCase("chicker")) {
			System.out.println("10.0");
	}else if(in.equalsIgnoreCase("soda")) {
		
	System.out.println("2.0");}
	}
}
}
