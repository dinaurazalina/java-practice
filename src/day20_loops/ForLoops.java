package day20_loops;

public class ForLoops {
public static void main(String[] args) throws InterruptedException {
	
	//using for loop print "Love java" 10 times
	
	for(int i = 1; i <= 10; i++) {
		System.out.println("Love java");
		
	}
	
	
	
	//print numbers from 5 to 15
	
	for(int j= 5; j <=15; j++) {
		System.out.print(j + " ");
		Thread.sleep(500);
	}
	System.out.println();

	
	//print for loop - print 20 > 10
	for(int i = 20; i >=10; i--) {
		System.out.print(i + " ");
		Thread.sleep(500);
	}
}
}
