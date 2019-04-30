package PracticeGroupStudy;
import java.util.*;
public class HomeworkSandwich {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);          
	String str = scan.next();
	int count = 0;

	int d, b;
	
	String substring = "";
	
	for (int i = 0; i <=str.length()-5; i++) {
		if(str.substring(i, i+5).equals("bread")){
			count++;
		
		}
	}
	
	 
	if(count == 2) {
		d = str.indexOf("bread");
		b = str.lastIndexOf("bread");
		substring = str.substring(d +5, b);
		System.out.println(substring);
		
	}else if(count >2){
		int d1 = str.indexOf("bread", str.indexOf("bread")+4);
		int b2 = str.lastIndexOf("bread");
		substring = str.substring(d1 +5, b2);
		System.out.println(substring);
	}
	
	else{
		System.out.println("nothing");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
