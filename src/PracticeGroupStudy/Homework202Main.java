package PracticeGroupStudy;

public class Homework202Main {
public static void main(String[] args) {
	TV tv1 = new TV();
	
	tv1.setBrand("Samsung");
	
	tv1.turnOn();
	tv1.setChannel(70);
	tv1.channelDown();
	tv1.setVolumeLevel(70);
	tv1.volumeUp();
	tv1.volumeUp();
	
	
	System.out.println(tv1.toString());
}
	
}
