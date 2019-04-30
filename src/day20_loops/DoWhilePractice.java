package day20_loops;

public class DoWhilePractice {
public static void main(String[] args) {
	
	
	int num = 1;
	
	do {
		System.out.print("&");
		num++;
	}while(num <= 3);


System.out.println();

int apples = 1;
int totalApples = 23;
do {
	System.out.println("Eating apples #" + apples);
	apples++;
}while(apples <= totalApples);




int num1 = 1;
int until = 10;

do {
	System.out.println("Number - " + until);
	until--;
}while(until>=num1);



}
}
