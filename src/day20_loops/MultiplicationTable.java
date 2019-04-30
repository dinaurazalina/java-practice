package day20_loops;
import java.util.*;
public class MultiplicationTable {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int num = scan.nextInt();
	if (num >=1 && num<=10) {
	for(int i =1; i <=10; i++) {
		System.out.println(num+ "x " + i +" = "+ num*i);
	}
		
	}else {
		System.out.println("Invalid number");
		return;
	}
	
	
	
}
}
