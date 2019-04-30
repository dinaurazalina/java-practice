package day30_methods02;
import java.util.*;
public class WarmUpMethods {
public static void main(String[] args) {
	
print5Stars();
	
//print print5Stars(); 10 times

int i = 0;
while(i <10) {
	print5Stars();
	i++;
	
	
}
introduce();
}
public static void print5Stars () {
	System.out.println("*****");
}

public static void introduce() {
	Scanner scan = new Scanner(System.in);
	String name = scan.next();
	System.out.println("Nice to meet you, " + name);
	
}

}
