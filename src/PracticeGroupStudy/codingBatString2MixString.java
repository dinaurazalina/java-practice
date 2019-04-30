package PracticeGroupStudy;

public class codingBatString2MixString {
	public static String mixString(String a, String b) {
		  String mixString = "";
		  
		  if(a.length() > b.length()){
		    for(int i = 0; i< a.length()-1; i++){
		      mixString += a.charAt(i)+""+ b.charAt(i);
		     
		    }
		    
		  }else if(a.length() < b.length()) {
		      for(int i = 0; i< b.length()-1; i++){
		      mixString += a.charAt(i)+""+ b.charAt(i);
		    }
		  }
		  
		  
		  
		  return mixString;
		 
		}
public static void main(String[] args) {
	System.out.println(mixString("abc", "xyz"));
	
}
}
