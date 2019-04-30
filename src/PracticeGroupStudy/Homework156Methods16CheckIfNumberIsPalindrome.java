package PracticeGroupStudy;
import java.util.*;
public class Homework156Methods16CheckIfNumberIsPalindrome {
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int num = scan.nextInt();
	    isPalindrome(num);
	  }
	  
	  public static void isPalindrome(int num){
	    //WRITE YOUR CODE HERE
	    
	    boolean isPalinrome;
	    int temp = num, reversedInt = 0;
	    int remainder ;
	    
	    while(num!=0) {
	    	remainder = num%10;
	    	reversedInt=reversedInt * 10 +remainder;
	    	num/=10;
	    }
	    if(temp == reversedInt) {
	    	isPalinrome = true;
	    }else {
	    	isPalinrome = false;
	    }	    
	    System.out.println(isPalinrome);
	  }
	}

