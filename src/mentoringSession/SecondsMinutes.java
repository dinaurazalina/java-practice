package mentoringSession;
import java.util.Scanner;
public class SecondsMinutes {
public static void main(String[] args) {
	
	 Scanner scan =  new Scanner(System.in);
	  int inputSeconds, hours, minutes, seconds;
	  System.out.println("Enter seconds:");
	  inputSeconds = scan.nextInt();
	  
 
	  
	  hours = (inputSeconds/60)/60; //or  hours = inputSeconds/3600;
	  
	  //which means
	  
	  //6789 / 60 = 113
	  //113 / 60 = 1 which is (3600 seconds)
	  // or 
	  
	  // 6789 / 3600 = 1
	  
	  
	  minutes = (inputSeconds/60)%60;
	  //which means 
	  //6789 / 60 =113 is how many minutes we have (what we get after we divide)
	  // 113 /60 = 1 full hour (how many 60s do we have in 113)
	  // 113 - 60 = 53 minutes you have if you take one full hour(which is 60 mins) (which is 3180 seconds)
	  
	 
	  
	  
	  seconds= inputSeconds%60;
	  //which means 
	  //(6789 /60) = 113 (what we get after we divide)
	  // 6789  - 113* 60 = 9 << remainder  
	  // seconds (leftover is 9) (how many seconds we have left )
	  
	  
	  
	 
	  
	  System.out.println(hours +" hours, " + minutes + " minutes, and " + seconds + " seconds" );
	    
	    
}
}
