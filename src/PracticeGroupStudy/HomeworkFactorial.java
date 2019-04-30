package PracticeGroupStudy;
import java.util.*;
public class HomeworkFactorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();

		
		for(long i = n-1; i>0; i--) {
		n= n*i;
		}
		
		System.out.println(n);
		
	}
}
//20922789888000