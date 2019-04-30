package PracticeGroupStudy;

import java.util.Arrays;

public class Homework138ZombieAttack {
public static void main(String[] args) {
	
	//Day 0 [3, 6, 0, 4, 2, 3, 7, 0]
	
	int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};
	int[] zero = new int [inhabitants.length];
	int count = 0;
	do {System.out.print("Day " +count + " ");
		System.out.println(Arrays.toString(inhabitants));
		
		
		
		for(int i = 0; i< inhabitants.length-1; i++) {
			if(inhabitants[i]==0 &&inhabitants[i+1]!= 0) {
				inhabitants[i+1] = inhabitants[i+1]/2;
				i++;
			}else if(inhabitants[i]!=0 && inhabitants[i+1]==0 ){
				inhabitants[i] = inhabitants[i]/2;
			}
		}
		
		count++;
	}while(!Arrays.equals(inhabitants, zero));
	System.out.print("Day " +count + " ");
	System.out.println(Arrays.toString(inhabitants));
	System.out.println("---- EXTINCT ----");
	
	
	
	
	
	
	
	
	
	
}
}
