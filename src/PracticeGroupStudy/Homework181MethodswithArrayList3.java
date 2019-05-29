package PracticeGroupStudy;
import java.util.*;
public class Homework181MethodswithArrayList3 {
public static void main(String[] args) {
	String let[] = {"1", "2", "3 "};
	String lett[] = {"4"};
	
 	System.out.println(combineRs(let, lett));
}
public static String combineRs(String[] r1, String [] r2) {
	String combineRs = "";
	
	List <String> boo = new ArrayList<>();
	
	for(String pooh : r1) {
		boo.add(pooh);
	}
	
	for(String chi: r2) {
		boo.add(chi);
	}
	
	for(String poohchi: boo) {
		combineRs+=poohchi;
	}
	
	return combineRs;
}
}
