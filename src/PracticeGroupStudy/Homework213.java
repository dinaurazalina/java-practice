package PracticeGroupStudy;
import java.util.*;
public class Homework213 {

		public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel) 
		  {
			 int refuel_times = 0;
			  int small= 0;
			  int big=0;
			  int total = 0;
				for(int i =0; i<deliveries.size(); i++) {
				if(	deliveries.get(i)<max_fuel) {
					small +=deliveries.get(i);
				}else {
					big+=deliveries.get(i);
				}
				total = small+big;
				
				refuel_times = big/max_fuel+small/max_fuel;
				if(total%max_fuel >0) {
					refuel_times +=1;
				}
				}
			
			    
		    
		   return refuel_times ;
		    
		  }
		  
		  public static void main(String[] args)
		  {
		    
		    ArrayList<Integer>  arr = new ArrayList<>();
		    arr.add(100);
		    arr.add(200);
		    arr.add(10);
		    arr.add(3);
		    arr.add(8);
		    
		    int times = refuel_times(arr,10);
		    System.out.print(times);//should output 5
		   
		    
		  }//end main
		
}
