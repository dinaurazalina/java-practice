package day18_while_dowhile_loops;

public class Counter {
public static void main(String[] args) throws InterruptedException {
	int num = 1;
	while(num <=10) {
		System.out.print(num+ ", ");
		num++;
		Thread.sleep(500);// pause the code execution for a second
	}
	
	
	
	int num1 = 11;
	
	while(num1 >=1) {
		System.out.print(num1 + ", ");
		num1--;
		Thread.sleep(456);
		
	}
}
}
