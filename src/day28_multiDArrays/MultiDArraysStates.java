package day28_multiDArrays;

import java.util.Arrays;

public class MultiDArraysStates {
public static void main(String[] args) {
	
	int [][] cities  = new int [3][4];
	cities [0][0] = 100;
	cities [0][1] = 123;
	cities [0][2] = 14350;
	cities [0][3] = 1423;
	
	cities [1][0] = 876;
	cities [1][1] = 1123;
	cities [1][2] = 23243;
	cities [1][3] = 5;
	
	cities [2][0] = 1543543;
	cities [2][1] = 34;
	cities [2][2] = 106750;
	cities [2][3] = 545;

	
	
	System.out.println(Arrays.toString(cities[0]));
	System.out.println(Arrays.toString(cities[1]));
	System.out.println(Arrays.toString(cities[2]));
	

	int [][] scores = {{3, 5, 6} , {4, 56, 3, 98} };
	System.out.println("Days played/ Number of arrays: " + scores.length );
	System.out.println("Number of values in 1: " + scores[0].length);
	System.out.println("Number of values in 2: " + scores[1].length);
}
}
