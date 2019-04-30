package PracticeGroupStudy;

public class CodingBatString2DoubleChar {
public static void main(String[] args) {
	

//	String str ="AAbb";
//	String doubleChar = "";
//	
//	  for(int i = 0; i< str.length();i++) {
//		  doubleChar += str.charAt(i)+""+ str.charAt(i); 
//	  }
//System.out.println(doubleChar);


String str1 = "ABChi hi";

int countHi = 0;
for(int i = 0; i< str1.length()-1; i++) {
	if(str1.substring(i, i+2).equals("hi")) {
		countHi++;
	}
}
System.out.println(countHi);
}
}