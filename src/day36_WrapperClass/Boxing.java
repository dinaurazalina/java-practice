package day36_WrapperClass;

public class Boxing {

	public static void main(String[] args) {
		//AUTOBOXING
		
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;
		
		
		
		//UNBOXING -> OBJECT > PRIMITIVE
		Double d1 = new Double(34.2);
		double d2 = d1;
		
		System.out.println("d1: "+ d1);
		System.out.println("d2: "+ d2);
		
		
		long l1 = new Long (6000000);//unboxing 
		Long l2 = new Long(2434232334L); //no boxing
		long l3 = l2; //unboxing
		Long l4 = l3; //autoboxing
		
		
		Integer num3 = Integer.valueOf(345);
		// Double d3 =
	}
}
