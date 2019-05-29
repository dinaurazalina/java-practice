package day51_inheritance;

public class Running extends Exercise {
@Override
	public int perform(int minutes) {	
		int cal  = 10 * minutes;
		System.out.println("By running you are burning "+cal+" calories in "+ minutes +" minutes." );
		return cal;
	}
}
