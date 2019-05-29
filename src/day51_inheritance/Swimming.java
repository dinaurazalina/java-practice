package day51_inheritance;

public class Swimming extends Exercise{
	@Override
	public int perform(int minutes) {	
		int cal  = 11 * minutes;
		System.out.println("By swimming you are burning "+cal+" calories in "+ minutes +" minutes." );
		return cal;
	}
}
