package day51_inheritance;

public class Yoga extends Exercise{
	@Override
	public int perform(int minutes) {
		int cal  = 5 * minutes;
		System.out.println("By performing yoga you are burning "+cal+" calories in "+ minutes +" minutes." );
		return cal;
	}
}
