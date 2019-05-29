package day52_inheritance;

import java.util.Arrays;

public class FinalArrays {

	public static void main(String[] args) {
		
		final int [] TEAMS = new int [] {11, 11};
		System.out.println("Team1: "+TEAMS[0]);
		System.out.println("Team2: "+TEAMS[1]);
		
		//you can change the values of the array
		TEAMS[0] = 10;
		TEAMS[1] = 9;
		System.out.println("Team1: "+TEAMS[0]);
		System.out.println("Team2: "+TEAMS[1]);
		
		//you cannot reassign to a new array
// 		TEAMS = new int[] {11, 1, 11, 2};
		
		final int [] nums = new int [] {23, 55, 3455};
		System.out.println(Arrays.toString(nums));
		
//		 nums = new int [] {23, 435, 34, 23, 45, 2};
//		System.out.println(Arrays.toString(nums));
		
		final int [] finalNums = {23, 65, 231, 45, 34};
		System.out.println(Arrays.toString(finalNums));
		finalNums[0] = 34552;
		System.out.println(Arrays.toString(finalNums));
		//but it cannot work
		//finalNums = new int [] {22, 34 ,21, 34, 43};
		
		
		final double PRICES []  = new double[3];
		PRICES[0] = 84.0;
		PRICES[1] = 99.99;
		PRICES[2] = 8.67;
		
		System.out.println(Arrays.toString(PRICES));
				
		PRICES[0] = 11.0;
	//double PRICES []  = new double[3]; < WILL NOT WORK
		
	}
}
