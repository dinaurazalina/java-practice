package day51_inheritance;

public class Snowboarding extends Exercise {

	public int perform(int minutes) {
		
	int cals=super.perform(10); //call super class version it call parent class methods/ variable
		int cal = 7 *minutes;
		System.out.println("By snowboarding for " +minutes +" you can burn "+cal+" calories");
		return cal+cals;
	}
	
}
