package mentoringSession;

public class LoopswithIvan {
public static void main(String[] args) {
	/* 
	 * 0
	 * 1
	 * 0+1= 1
	 * 1+1=2
	 * 1+2=3
	 * 2+3=5
	 * 
	 * 
	 * 
	 * 
	 */
	int num = 0;
	int fib0 = 0;
	int fib1 = 1;
	int fib = 0;
	
	for(num = 2; num <=20; num++) {
		//1		//0 + // 1
		fib = fib0 + fib1;
		fib0 = fib1;
		fib1 = fib;
		System.out.println(fib);
	}
}
}
