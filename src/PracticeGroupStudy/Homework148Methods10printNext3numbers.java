package PracticeGroupStudy;
import java.util.Scanner;
public class Homework148Methods10printNext3numbers {
	
	  public static void main(String[] args) {
	     Scanner inp = new Scanner(System.in);
	     System.out.print("enter number");
	     int num = inp.nextInt();
	     
	     next3(num);
	  }
	  
	  public static void next3(int num) {
		  int i = num+3;
		  while(num<i) {
			  System.out.print(num+1+ " ");
			  num++;
		  }
		  
	  }
}
