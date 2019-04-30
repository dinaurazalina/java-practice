package PracticeGroupStudy;
import java.util.*;
public class Homework120ArraysPrintShortestWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
//	    String str = scan.nextLine();
//	    String [] strArr = str.split(", ");
//	    
//		int min =strArr[0].length();
//		String petite = "";
//		for(int i = 0; i < strArr.length; i++) {
//			if(strArr[i].length()< min) {
//				min = strArr[i].length();
//				//petite = strArr[i];
//				
//				
//			}
//		}
//		for(int i = 0; i < strArr.length; i++) {
//			if(strArr[i].length()==min) {
//				petite += strArr[i] + " ";
//			}
//		} 
//		
//		 String [] strArr1 = petite.split(" ");
//		 Arrays.sort(strArr1);
//			
//			System.out.println(Arrays.toString(strArr1));
//			
			
			
			
			
	 String[] str = {scan.next(), scan.next(), scan.next(), 
	                    scan.next(), scan.next(), scan.next()};
	                    
	  int min = str[0].length();
	  String petite = "";
	  
	  for(int i= 0; i< str.length; i++){
	    if(str[i].length() < min){
	      min = str[i].length();
	      petite = str[i];
	    }
	  }System.out.println(petite);
	  
	  }
	}
			
			
			
	}
}
//olive, fish, pursuit, old, warning, python, java, coffee, cat, ray