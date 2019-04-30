package PracticeGroupStudy;
import java.util.Scanner;

public class homeworkCaffeine {
public static void main(String[] args) {
	

Scanner scan = new Scanner(System.in);
System.out.println("Enter number of milligrams in drink: ");
int lethalOverdose = 10000;
int mgInDrink = scan.nextInt();
int lethalAmount = lethalOverdose/mgInDrink;


System.out.println("If would take about " + lethalAmount + " drinks for a lethal overdose.");

}
}
