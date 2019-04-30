package day19_loops;

public class DoWhile {
	public static void main(String[] args) {
		
		//print 1 to 10 using do while loop
		int i = 1;
		
		do {
			System.out.println(i);
			i++;
		}while(i <=10);
		
		//write do while loop to calculate sun of numbers 
		//between 1 and 5
		
		//1+2+3+4+5;
		
		
		int sum = 0;
		int j = 1;
		
		
		do {
			System.out.println(j);
			sum+=j;
			j++;
		}while(j <= 5);
		System.out.println("Sum from 1 to 5 is " + sum);
	}

}
