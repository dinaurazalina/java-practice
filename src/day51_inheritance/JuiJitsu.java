package day51_inheritance;

public class JuiJitsu extends Exercise{
	@Override
	public int perform(int minutes) {	
		int cal  = 12 * minutes;
		System.out.println("By performing general exercise you are burning "+cal+" calories in "+ minutes +" minutes." );
		return cal;
	}
	
}
