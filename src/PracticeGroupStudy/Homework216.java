package PracticeGroupStudy;
import java.util.*;
public class Homework216 {
	 public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) 
	  {
	   ArrayList<Integer> rem = new ArrayList<>();
	   
	  for(Integer i: r){
	    if(n!=i){
	      rem.add(i);
	    }
	  }
	   return rem;
	  }
	  
	  public static void main(String[] args)
	  {
	  
	    ArrayList<Integer>  arr = new ArrayList<>();
	    Integer[] nums = new Integer[]{1,1,2,3,1,4};
	    arr.addAll(Arrays.asList(nums));
	    
	    System.out.print(removeInst(arr,1));
	   
	  }
}
