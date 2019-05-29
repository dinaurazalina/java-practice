package PracticeGroupStudy;
import java.util.*;
public class Homework175Methods {

	public static void main(String[] args) {
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
		 String [] dbArr = db.split("#"); //[1etsy, 2wooden, 3spoon, ]
		 
		 switch(op) {
		 case"add":
			dbArr = Arrays.copyOf(dbArr, dbArr.length+1);
			dbArr[3] = id+data;
			break;
		
		 case"edit":
			 int idInt = Integer.parseInt(id);
			 dbArr[idInt-1]=data;
			 break;
		 case"delete":
			 int idInt2 = Integer.parseInt(id);
			dbArr[idInt2-1]="";
			break;
		 case "none":
			 dbArr = dbArr;
			 break;
			
		 }
		 
		 for(String b: dbArr) {
			 db+=b+"#";
		 }
		 return db;
		 
		 
		 
	  }
}
