package day30_methods02;
import java.util.*;
import java.util.Random;

public class MyNumbers {
public static void main(String[] args) throws InterruptedException {
	showMe5Numbers();
	doPush10Ups();
	rangePrint();
	
}

public static void showMe5Numbers()  {
	Random rand = new Random(); 
	int count = 0;
	while(count < 5) {
		System.out.print(rand.nextInt(1000)+ " ");
		count++;
	}
	System.out.println();
	
}


public static void doPush10Ups() throws InterruptedException {
	int p = 1;
	while(p<=10) {
		
		System.out.println("Pushup - " + p);
		p++;
		Thread.sleep(2000);
	}System.out.println("Time to rest");
	
}

public static void rangePrint() throws InterruptedException {
	/*
	 * method name: rangePrint
	 * return type: void
	 * param/ args: no
	 * 
	 *using a scanner ask for 2 integers.
	 *you need to print out all nums between those to numbers
	 */
	
	
	Scanner scan = new Scanner(System.in);
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	
	if(num1 == num2) {
	System.out.println(num2);
	}
	if(num1 < num2) {
		for(int i = num1; i <= num2; i++) {
			System.out.print(i + " ");
			Thread.sleep(2000);
		}
	}else {
		for(int j= num2; j<= num1; j++) {
			System.out.print(j + " ") ;
			Thread.sleep(2000);
		}
	}
	
}
}
