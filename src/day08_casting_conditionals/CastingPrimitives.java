package day08_casting_conditionals;

public class CastingPrimitives {

	public static void main(String[] args) {
		//cast double value to int
		int i = (int)3.4;
		System.out.println(i); // 3 > it will remove .4
		
	
		double j = (int)3;
		System.out.println(j);
	
	
		double price = 230.50;
				int dollars = (int)price;
		System.out.println("Dollars: " + dollars);
	
		
		
		//whole numbers. byte, short, int
		
		int count = 48;
		byte byteCount = (byte)count;
		
		System.out.println(byteCount);
	
	
		long longValue = 38495774932L;
		int intValue = (int)longValue;
		System.out.println(intValue);
	
		
		
		int large = 5678;
		short small = (short)large;
		System.out.println("Small: " +small);
		
			//250	//250	//250.2
		int result = (int)(500.4/2.0);
						
		System.out.println("Result:" +result);

		
		
//from smaller value to a bigger value you don't need to cast it automatically
		byte b = 123;
		int o = b;
		
	}
	
}
