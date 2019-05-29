package PracticeGroupStudy;

public class Homework214 {

		
	 public static  double convertC(String[][] money,String[][] convertionRate) 
	  {
		 double result = 0;
		 for (int i = 0; i < money.length; i++) {
			for (int j = 1; j < money[i].length; j++) {
				  result+= Double.parseDouble(money[i][j]) * Double.parseDouble(convertionRate[i][j]);	
			}
			
		}
		
		  
		  return result;
	  }
	  
	    public static void main(String[] args) 
	   {
	     
	     
	     
	    	String[][] money = { { "euro", "1.5" }, { "yen", "21.5" }, { "mark", "100.0" } };
			String[][] convertionRate = { { "euro", "0.003" }, { "yen", "0.5" }, { "mark", "0.87" } };
	     
	    
	     
	   }

	  
	
}
