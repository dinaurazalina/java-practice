package day52_inheritance;

public class EqualsMethods {

	public static void main(String[] args) {
		
		Computer comp1 =new Computer("iMac", "silver");
		Computer comp2 =new Computer("iMac", "silver");
		
		Computer comp3 = comp2;
		
		System.out.println(comp1 == comp2);
		System.out.println(comp1.equals(comp2));

		System.out.println(comp3 == comp2);
		System.out.println(comp3.equals(comp2));
		
		String str1 = "java";
		String str2 = "java";
		
		System.out.println(str1== str2); // it checks if str1 and str2 point at the same spot in heap
		System.out.println(str1.equals(str2)); //actually compares the values 
		
		int b1 = 3;
		int b2 = 3;
		System.out.println(b1 == b2);// they are all in stack that is why is gives you true
		
	}
}
