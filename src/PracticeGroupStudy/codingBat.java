package PracticeGroupStudy;

public class codingBat {
	public static void main(String[] args) {
		
	
	
	String str; 
	int index; 
		  
	String twoChar;
		  
		   if(index == 0){
		    twoChar = str.substring(0, str.length()-3);
		  }
		  else if(index == 2){
		    twoChar = str.substring(str.length()-2);
		  }
		  else if(index >2){
		    twoChar = str.substring(0, str.length()-3);
		  }
		  
		  System.out.println(twoChar);
		
}
}