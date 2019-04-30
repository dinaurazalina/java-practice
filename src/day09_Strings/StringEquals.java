package day09_Strings;

public class StringEquals {
public static void main(String[] args) {
	
	String str1 = "java";
	String str2 = "java";
	
	//using ==
	
	System.out.println(str1 == str2);  //true 
	
	//or
	
	System.out.println(str1 == "java");  //true
	
	//or
	
	System.out.println(str1 == "Java");  //true
	
	
	//equals method
	
	
	
	System.out.println(str1.equals(str2));
	
	System.out.println(str2.equals("java"));

	System.out.println(str2.equals("Java"));


//String month = March
	
	String month = new String("March");
	String month2 = new String("March");
	
	System.out.println(month == month2);//false
	
	
	System.out.println(month.equals(month2)); //true
	System.out.println(month.equals("March")); //true
	
	
	
	
	





}
}
