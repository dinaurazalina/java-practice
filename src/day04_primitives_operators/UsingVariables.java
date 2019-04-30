package day04_primitives_operators;

public class UsingVariables {
	public static void main(String[] args) {
		
		//declare int variables num1, num2, num3
		
		int num1, num2, num3;
		num1 = 700;
		num2 = 100;
		num3 = num1;
		num1 = num2;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		
		//declare apples and assign 25
		//declare kiwis and assign values of apples to it
		//declare mangos and 55
		//declare mangos to kiwis
	
		int apples = 25;
		int kiwis = apples;
		int mangos = 55;
			 kiwis = mangos;
			
			System.out.println(apples); //25
			System.out.println(kiwis); //55
			System.out.println(mangos); //55
			
	
	
		
	}

}
