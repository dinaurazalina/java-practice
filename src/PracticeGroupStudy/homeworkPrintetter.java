package PracticeGroupStudy;
import java.util.*;
public class homeworkPrintetter {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    char start = scan.next().charAt(0);
    char end = scan.next().charAt(0);

    String alfCap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String alfLow = "abcdefghijklmnopqrstuvwxyz";

    if(alfCap.contains(start +"")) {
    	alfCap= alfCap.substring(alfCap.indexOf(start), alfCap.indexOf(end));
    	System.out.println(alfCap);
    }else {
    	alfLow= alfLow.substring(alfLow.indexOf(start), alfLow.indexOf(end));
    	System.out.println(alfLow);
    }







}
}
