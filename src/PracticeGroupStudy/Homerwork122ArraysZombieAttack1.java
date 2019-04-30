package PracticeGroupStudy;
import java.util.*;
public class Homerwork122ArraysZombieAttack1 {
public static void main(String[] args) {

	    Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	    }
	    int count = 0;
	    int[] zeroArr = new int[inhabitants.length];
	    
	    do {System.out.print("Day "+ count + " ");
	    	System.out.println(Arrays.toString(inhabitants));
	    	for(int i =0; i< inhabitants.length; i++) {
	    		inhabitants[i] = inhabitants[i]/2;
	    		Arrays.toString(inhabitants);
	    	}
	    	
	    	count++;
	    }while(!Arrays.equals(inhabitants, zeroArr));
	    System.out.print("Day "+ count + " ");
		System.out.println(Arrays.toString(inhabitants));
	    
	    
	    
	    //3 6 0 4 3 2 7 0
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	  }
}
