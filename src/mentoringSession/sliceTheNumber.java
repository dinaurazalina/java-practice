package mentoringSession;
import java.util.Scanner;
public class sliceTheNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your number:");
		
		int num = scan.nextInt();
		
		//if the num is 32345
		// that only means that it has
		// 30000
		//	2000
		//	 300
		//	  40
		//	   5
		
		
	//all we need to do is to find a way to print them
		
		//we need to start with the fist digit: which represents the greatest number. 
		//in our case it is 30000
	
		
		//what can we do to get a result of 3.
		//lets remember the simple math rule: 
		// if you divide 30 by 10 what is the result? 3
		//we do the same exact thing
		// we need to find what category it belongs.
		// it could be 90000, 60000, as long as it had 4 zeros it belongs to the TEN THOUSAND CATEGORY
		// you divide 30000/ 10000 you get 3 sp heres your digit!
		//lets move on to the second one
		
		//to find the second digit we need to work with the lefover from 30000
		//we find remainder of 2345 and we divide it by 1000 >> we get full 2
		
		// to find the third number we need to  find whats going to remain after dividing by 1000 and divide it by 100 and so on 
		
		int digit1, digit2, digit3, digit4, digit5;
		
		
//
//		
//		digit1 = num/10000;
//		System.out.println(digit1);
//		
//		digit2 = num%10000/1000;
//		System.out.println(digit2);
//		
//		digit3 = num%10000%1000/100;
//		System.out.println(digit3);
//		
//		digit4 = num%10000%1000%100/10;
//		System.out.println(digit4);
//		
//		digit5 = num%10000%1000%100%10/1;
//		System.out.println(digit5);
//		
		
		
		
		
		 num = scan.nextInt();
         digit5 = num %10;
         digit4 = num%100/10;
         digit3 = num%1000/100;
         digit2 = num%10000/1000;
         digit1 = num%100000/10000;
        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);
	}
}
