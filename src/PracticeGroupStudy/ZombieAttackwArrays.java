package PracticeGroupStudy;
import java.util.*;
public class ZombieAttackwArrays {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    int[] inhabitants = new int[8];
    int [] zeros=new int [inhabitants.length];
    for(int i=0; i<inhabitants.length; i++) {
      inhabitants[i] = input.nextInt();
    }
    
    int dayCount = 0;
   
		do { System.out.print("Day "+ dayCount +" ");
			System.out.println(Arrays.toString(inhabitants));
    for(int i = 0;i <inhabitants.length; i++){
    
    	inhabitants[i] = inhabitants[i]/2;  
		} dayCount++;
    } while(!Arrays.equals(inhabitants,zeros));
		System.out.print("Day "+ dayCount +" ");
		System.out.println(Arrays.toString(inhabitants));
  
    //3 6 0 4 3 2 7 1
    
    
}    
    
}
