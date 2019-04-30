package PracticeGroupStudy;
import java.util.Scanner;
public class homeworkSwapNames {
	public static void main(String[] args) {
		

    Scanner scan = new Scanner(System.in);
    System.out.println("enter email");
    String email = scan.next();
    
    String a, b;
    int indexBf = email.indexOf("_");
    int index2 = email.indexOf("@");
    System.out.println(indexBf);
    if(email.contains("_")){
    	a = email.substring(0, indexBf);
    	b = email.substring(indexBf+1, index2);
      System.out.println(b + a + "@gmail.com");
    }else {
      System.out.println(email);
    }
}
}