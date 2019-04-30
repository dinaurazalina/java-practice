package PracticeGroupStudy;

public class Homework155MethodsFibonacciNumber {
public static void main(String[] args) {
	
	int f1= 0;
	int f2 =1;
	int sum =0;
	
	for(int i = 1; i <4; i++) {
	f1 = f2;
	f2 =sum;
	sum = f1 +f2;
	
	}System.out.println(sum);
	
}

}
