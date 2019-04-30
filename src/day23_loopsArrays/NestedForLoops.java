package day23_loopsArrays;

public class NestedForLoops {

	public static void main(String[] args) {
		//outer loop will repeat printing of letter as many times as we want
		// in this case we are going to print 3 items
		// so we are repeating inner loop 3 times
		for(int i = 1; i <=6; i++) {
			//write a loop, that will print letter from a to z
			if(i%2==0) {
			for(char letter= 'a';  letter <='z'; letter++) {
			System.out.print(letter +" ");
			}
			}else {
				for(char letter= 'z';  letter >='a'; letter--) {
					System.out.print(letter +" ");
			}
			
		}System.out.println("\n****************************************************");
		}
	}
}
