package PracticeGroupStudy;
import java.util.*;
public class Homework167MethodsWithString2Unique {
  public static void main(String[] args) {
    //test your code
    System.out.println( uniqueChars("java") ) ;
  }
  
  public static String uniqueChars(String str) {
    //TODO: write your below
    String uniqueChars = "";
    int count = 0;
    
    for (int i = 0; i < str.length(); i++){
      for(int j = 0; j < str.length(); j++){
      if(str.charAt(i)==str.charAt(j)){
        count++;
      	}
      }if(count ==1){
          uniqueChars += str.charAt(i) +"";
      }else if(count == 2 && !uniqueChars.contains(str.charAt(i)+"")) {
    	  uniqueChars += str.charAt(i) +"";
      }
    count =0;
    }
    return uniqueChars;
  }
}

