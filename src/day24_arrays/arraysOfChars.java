package day24_arrays;

public class arraysOfChars {
public static void main(String[] args) {
	
//	char [] values = {'a', 'b', 'c' };
//
//	for (char value: values) {
//	System.out.println(value);
//}
	String str = "Wooden spoon";

	//this method toCharArray() converts string into 
	//arrays of characters
	char [] chars = str.toCharArray();

	for(char c: chars) {
		System.out.print(c + "_");
	
}
	System.out.println();
	str = "";
	for(int i = chars.length - 1; i>=0; i--) {
		System.out.print(chars [i] +"_");
	}
//	
//	//Print characters with help of characters one by one
//	//if character is equals to 'o', replace it with '*';
//	System.out.println();
//	System.out.println();
	
//	for(char c: chars) {
//		if(c  == 'o') {
//			System.out.print("*");
//		}else {
//			System.out.print(c);
//		}
//		
//	}

}
}
