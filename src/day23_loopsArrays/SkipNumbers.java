package day23_loopsArrays;

public class SkipNumbers {
public static void main(String[] args) {

	for(int i = 1; i <=20; i++) {
	 if(i>=5 && i<=10) {
		 continue;
	 }
	 System.out.print(i + " ");
	}
	
}
}
