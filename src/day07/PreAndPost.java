package day07;

public class PreAndPost {
	public static void main(String[] args) {
		
		int num = 10;
		
		
		int num2 = num++;
	
		System.out.println("num: "+ num);
			System.out.println("num2: " + num2);
	
		
		
		int n = 20;
		int n2 = ++n;
		System.out.println("n: " + n);
		System.out.println("n2: " + n2);
		
		
		int i =10;
		i++;
		++i;
	System.out.println("I value : " + i);
	
	int apple = 5;
	int pear = ++apple;
	System.out.println("apples" + apple);

	System.out.println("pears" + pear);
	
	
	
	
	int bananas = 6;
	int apples = ++bananas;
	int pears = bananas++;

	
	System.out.println("bananas: " + bananas);
	System.out.println("pears: " + pears);
	System.out.println("apples: " + apples);
	
	int friends = 10;
	System.out.println(friends++);
	System.out.println(friends);
	System.out.println(++friends);
	
	
	
	int p1  = 10;
	int sum = p1++ +5;
	
	//p1 +5 and assign to p1
	//p1 = p1 +1
	
	System.out.println("sum: " + sum);
	System.out.println("p1: " + p1);
	

	
	
	int batteries = 8;
	int oldBatteries = 5;
	int totalBatteries = batteries++ + ++oldBatteries;
	System.out.println("batteries: " + batteries);//9
	System.out.println("old batteries: " + oldBatteries); //6
	System.out.println("total :  " + totalBatteries); //14
	
	
	
	
	
	}

}
