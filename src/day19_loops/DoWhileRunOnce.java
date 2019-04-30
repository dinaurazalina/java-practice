package day19_loops;

public class DoWhileRunOnce {
public static void main(String[] args) {
	//in this example, do while loop body code will run 
	//once then test the condition.Then exit the loop,
	//as condition is false
	int count = 10;
	
	do {
		System.out.println(count);
		count++;
	}while(count <= 5);
}
}
