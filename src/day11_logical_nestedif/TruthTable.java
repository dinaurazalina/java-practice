package day11_logical_nestedif;
import java.util.Scanner;
public class TruthTable {
public static void main(String[] args) {
	
	System.out.println("##### Truth TABLE FOR && OPERATOR #####");
	System.out.println("WHen true && true - result is " + (true && true)); //true
	System.out.println("WHen true && false - result is " + (true && false));//false
	System.out.println("WHen false && true - result is " + (false && true));//false
	System.out.println("WHen false && false - result is " + (false && false));//false
	
	System.out.println();
	
	System.out.println("##### TRUTH TABLE FOR OR OPERATOR");
	System.out.println("WHen true || true - result is " + (true || true)); //true
	System.out.println("WHen true || false - result is " + (true || false));//true
	System.out.println("WHen false || true - result is " + (false || true));//true
	System.out.println("WHen false || false - result is " + (false || false));//false

	System.out.println();
	System.out.println("##### TRUTH TABLE FOR !(NOT) OPERATOR #####" );
	System.out.println("When !true - result is " + (!true));
	System.out.println("When !false - result is " + (!false));
	
	
	
	
}
}
