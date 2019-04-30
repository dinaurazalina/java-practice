package PracticeGroupStudy;
import java.util.*;
public class HomeworkBinary {

	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		    
		    int decimal = input.nextInt();
		    int[] binary = new int[8];
		    int binary1 = 0;

		    String output = "";
		    
		    binary[0] = 128; 
		    binary[1] = 64; 
		    binary[2] = 32; 
		    binary[3] = 16; 
		    binary[4] = 8; 
		    binary[5] = 4; 
		    binary[6] = 2; 
		    binary[7] = 1; 
		    
	int value  = 0;
	for(int i = 0; i<=7; i++) {
			if(decimal/ binary[i]== 0) {
				binary1=0;
				output += binary1+ " ";
			}else {
				binary1=1;
				output += binary1+ " ";
				decimal = decimal%binary[i];
				
			}		
	}
	
	String binary0 [] = output.split(" ");
	
	System.out.println(Arrays.toString(binary0));
	
	
	
	
	
	
	
	
	
	
	}

	private static String[] split(String output) {
		// TODO Auto-generated method stub
		return null;
	}
}
