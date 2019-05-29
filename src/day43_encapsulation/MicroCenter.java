package day43_encapsulation;

public class MicroCenter {

	public static void main(String[] args) {
		
		Computer comp1 = new Computer();
		Computer comp2 = new Computer();
		
		System.out.println(comp1.toString());
		System.out.println(comp2.toString());
	
		comp1.setBrand(" iMac");
		comp1.setOs(" macOS Mojave");
		comp1.setPrice( 2500);
	
		comp2.setBrand(" Dell XPS");
		comp2.setOs(" Windows 10");
		comp2.setPrice( 500);

		System.out.println(comp1.toString());
		System.out.println(comp2.toString());
	
	
		Computer comp3 = new Computer("ASUS", "Windows 7", 500.99);
		System.out.println(comp3.toString());
		
		comp3.setOs("Windows 11");
		System.out.println(comp3.toString());
		
		comp3.setPrice(comp3.getPrice()-200);System.out.println(comp3.toString());
	}
}
