package PracticeGroupStudy;
import java.util.Scanner;
public class homeworkVehiclesRecall {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter vehicle's year:");
		
		int year = scan.nextInt();
		
		if(year >=1995 && year<= 1998) {
			System.out.println("Your vehicle needs to be recalled!");
		}else if(year >=2001 && year <=2002){
			System.out.println("Your vehicle needs to be recalled!");
		}else if(year >=2004 && year<=2006){
			System.out.println("Your vehicle needs to be recalled!");
		}else if(year >=2015 && year <=2017){
			System.out.println("Your vehicle needs to be recalled!");
		}else {
			System.out.println("Your vehicle is fine, enjoy!");
	}
	}
}
