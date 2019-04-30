package day23_loopsArrays;

public class PrintNumbersWithLOOP {
public static void main(String[] args) {
	
	
	for(int i = 1; i <=10; i++) {
		
		for(int j = 1; j<=i; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}	
	
	
	for (int j =10; j>=1; j--) {
		for (int i = j; i>=1; j--) {
			System.out.print(i + " ");
	}System.out.println();

		
	}
}
}
