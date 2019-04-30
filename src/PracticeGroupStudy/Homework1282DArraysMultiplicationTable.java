package PracticeGroupStudy;
import java.util.*;
public class Homework1282DArraysMultiplicationTable {

	public static void main(String[] args) {
		int [][] multiplicationTable = new int[10][10];
		

		
	
		for(int i = 1; i <=10; i++) {
			for (int j = 1; j <=10; j++) {
	
				multiplicationTable[i-1][j-1]= i*j;
			}
		} 
		System.out.println(Arrays.deepToString(multiplicationTable) ) ;
	}
}
