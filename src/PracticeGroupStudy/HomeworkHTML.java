package PracticeGroupStudy;
import java.util.Scanner;
public class HomeworkHTML {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String html = scan.nextLine();
	
	int idx1= html.indexOf("id=\"");
	
	int idx2 = html.indexOf("\">", idx1+1);
	

	if(html.contains("<html>")) {
		System.out.println(html.substring(idx1+4, idx2) );
	}else {
		System.out.println("Invalid input!");
	}
	
}
}
