package PracticeGroupStudy;

public class Homework168MethodsWithString3Cover {
	public static void main(String[] args) {
	    System.out.println(coverString("Certified Wooden Spoon", "o") ) ; //java [me]thods
	  }
	  
	  public static String coverString(String main, String coverME) {
		  String coverString = "";
		  if(main.contains(coverME)){
		  for(int i =0; i < main.length()-coverME.length(); i++) {
			 if(main.substring(i, i+coverME.length()).equals(coverME)) {
				 coverString = main.replace(main.substring(i, i+coverME.length()), "["+ coverME +"]");
			 }
			 
		  }
		  
		  }else {
			  coverString = main;
		  }
		  
		  return coverString;
		  
	  }
	  
	  
	  
	  /*
	   * 
	   * String main = "wooden spoon"
	   * String coverME = "o";
	   * 
	   * String cover  = "[" + coverME + "]";
	   * if(main.contains(coverME){
	   * main = main.replace(coverME, cover)}
	   * else{
	   * if(!main.contains(coverME){
	   * 
	   * main = "["+ main  + "]";
	   * return main;
	   * }
	   * }
	   * 
	   * 
	   */
	  
	}

