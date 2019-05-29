package day49_inheritance;
//TV is a child  class in the same package
public class TV extends device{

	public void watch() {
		System.out.println("Watching TV - "+ brand + " model : "+ model );
		System.out.println("Price : "+ price);
		//System.out.println("Made in "+ country); <<  not visible, cuz its private
		
	}
}
