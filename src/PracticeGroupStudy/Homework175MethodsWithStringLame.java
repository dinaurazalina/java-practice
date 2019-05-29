package PracticeGroupStudy;
import java.util.*;
public class Homework175MethodsWithStringLame {

	

	  public static String lameDb(String db, String op,String id,String data)
	  {
		  String ret = "";
		  
		  
		  switch(op) {
		  case"add":
			  if(data.length() > 0) {
			 ret = db+"#"+id+data;
			 
			
			 }else {
				 ret = db;
			 }
			 break;
		  	case"edit":
			 for(int i = 0; i < db.length(); i++) {
				 
				 int idxOfid = db.indexOf(id);
				  int idxOfHash = db.indexOf("#",idxOfid ) == -1? db.length()-1: db.indexOf("#",idxOfid );
				 ret = db.substring(0, idxOfid)+ id+ data+ db.substring(idxOfHash);
			  }
			 break;
			 
		  	case"delete":
		  		int idxId= db.indexOf(id);
		  		int idxHash = db.indexOf("#", idxId);
		  		if(idxId ==0) {
		  			ret = db.substring(idxHash);
		  			break;
		  		}
		  		
		  		ret = db.substring(0, idxId)+db.substring(idxHash+1);
			  break;
			  
		  	case"none":
		  		ret = db;
		  		break;
		  		
		}
		  
		 return ret; 
	  }
	  
	  
	  
	   public static void main(String[] args) 
	   {
	    
	     
	     System.out.print(
	       lameDb("1etsy#2wooden#3spoon","add","4","tea")+"\n"
	       );
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
	       );
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","delete","1","")+"\n"
	       );
	       
	        System.out.print(
	       lameDb("1tst#2bla#3foo","none","1","")+"\n"
	       );
	     
	   }
	 
}