package day18_while_dowhile_loops;

public class StairCase {
public static void main(String[] args) {
	
	/*
	 ** 
	 **
	 ***
	 ****
	 *****
	 */

String stairs = "*";
System.out.println(stairs);



while(stairs.lastIndexOf("*")< 20) {
	System.out.println(stairs);
	stairs+="*";

}

//or 
stairs = "*";
System.out.println(stairs);
while(stairs.length()<= 20) {
	System.out.println(stairs);
	stairs+="*";
}



}
}
