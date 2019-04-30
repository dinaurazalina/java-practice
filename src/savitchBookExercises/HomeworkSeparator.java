package savitchBookExercises;
import java.util.Scanner;
public class HomeworkSeparator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next();
		String separator = scan.next();
		int count  = scan.nextInt();
		String output = "";
		
		for ( int i = 0; i < count; i++);
		if(count > 1) {
			output += word + separator;
		}
		
		System.out.println(output);
	}
}
