package PracticeGroupStudy;
import java.util.Arrays;
public class homework204 {

		public static int[] populate(int[] r) 
		{
		  int g= 1;
		 for(int k =0; k < r.length; k++){
		   r[k] = g;
		   g++;
		 }
			return r;
		}
		
		public static void main(String[] args) 
		{
		 
		  
	    int [] i= new int[3]; 
	    i= populate(i) ;
	    System.out.println(Arrays.toString(i));

		}
	}

