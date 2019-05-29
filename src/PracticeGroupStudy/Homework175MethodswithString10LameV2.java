package PracticeGroupStudy;
import java.util.*;
public class Homework175MethodswithString10LameV2 {
	public static void main(String[] args) 
	   {
	     System.out.print(
	       lameDb("1etsy#2wooden#3spoon","add","4","tea")+"\n"
	       );
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","edit","1","dina")+"\n"
	       );
	       
	      System.out.print(
	       lameDb("1tst#2bla#3foo","delete","3","")+"\n"
	       );
	       
	        System.out.print(
	       lameDb("1tst#2bla#3foo","none","1","")+"\n"
	       );
	        
	        /*
	         * 		m.lameDb("1etsy#2wooden#3spoon","add","4","aaa")
					returns:  1etsy#2wooden#3spoon#4aaa

					
					m.lameDb("1test#2bla#3foo","edit","2","bbb")
					returns:  1test#2bbb#3foo
					
					
					m.lameDb("1tst#2bla#3foo","delete","1","")
					returns:  #2bla#3foo
					
					m.lameDb("1tst#2bla#3foo","none","1","")
					returns:  1tst#2bla#3foo
	         */
	     
	   }
	 public static String lameDb(String db, String op,String id,String data)
	  {
		 String lameDb = "";
		 String [] boo = db.split("#"); //[1etsy, 2wooden, 3spoon]
 		 
		 if(op.equals("add")) {
			 String [] add = new String [boo.length+1];
			 for(int i = 0; i< boo.length; i++ ) {
				add[i]=  boo[i];
			 }
			 add[add.length-1] = id+ data;
			 
			 for(int i = 0; i<add.length; i++) {
				 if(i == 0) {
					 lameDb+=add[i]; 
				 }else {
				 lameDb +="#" +add[i];
				 }
			 }
			 

			 
		 }else if(op.equals("edit")) {
			 
			 boo[Integer.parseInt(id)-1] =id+ data;
			 for(int i = 0; i<boo.length; i++) { 
				 if(i == 0) {
				 lameDb+=boo[i]; 
			 }else {
			 lameDb +="#" +boo[i];
			 }
			 }
			 
		 }else if(op.equals("delete")) {
			 int idN = Integer.parseInt(id);
			db = db.substring(db.indexOf(idN)+5);
			lameDb = db;
			
			
		 }else if(op.equals("none")){
			 lameDb = db;
		 }
		 
		 
		 
		 return lameDb;
	  }
	
}
