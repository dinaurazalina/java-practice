package day36_WrapperClass;

public class WrapperClasses {

	public static void main(String[] args) {
		int n1 = 10;
		Integer n2 = new Integer(68);
		
		System.out.println(n1 + " " + n2);
		
		double d1 = 44.5;//just a primitive 
		Double d2 = new Double(1234.5);//it is an object now!
		Double d3 = new Double("567.3");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d1+d2+d3);
		
		char ch1 = 'a';
		Character ch2 = new Character('b');
		System.out.println(ch1);
		System.out.println(ch2);
		
		byte b1 =100;
		Byte b2 = new Byte((byte)10);
		Byte b3 = new Byte("-55");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b1+b2+b3);
	
		Integer num1 = Integer.valueOf(1234);
		Integer num2 = Integer.valueOf("498");
		System.out.println(num1);
		System.out.println(num2);
		
		Boolean boo1 = Boolean.valueOf(true);
		Boolean boo2 = Boolean.valueOf("false");
		System.out.println(boo1);
		System.out.println(boo2);
		
		Integer i =123;
				
		
	}
}
