package day05_math_operators;

public class CompanyWarmUp {
 public static void main(String[] args) {
	

	
	String companyName = "Facebook"; 
	String address = "Silicon Valley, CA";
	long revenue = 340000000L;
	int numberOfEmployees = 100000;
	boolean isTechCompany = true;
	
	System.out.println("Company name is " + companyName);
	System.out.println("The company address is " + address);
	System.out.println("The company has " + numberOfEmployees + " employees" );
	System.out.println("The revenue of the " + companyName + " is " + revenue);
	System.out.println(" - Is it a TechCompany? " + " \n - "+ isTechCompany);
	
	
	//for new line 
	
	System.out.println();
	System.out.println();  
	
	//or 
	
	System.out.println("\n");  
	
	
	
	String aboutCompany = "\n My Company's name is " + companyName + " which is located at " + address + " as you know, it is very succesful and it has " + numberOfEmployees + " \n employees working for it.";
	
	System.out.println(aboutCompany);
	
	//Mathematical operations
	
	int x = 1;
	x = x + 3;
	
	System.out.println(x);
	
	System.out.println();
	
	int c = 7;
	int d = c +1;
	System.out.println(d);
		
	System.out.println();
	
	int r= 1;
	int y = r*2;
	int z = 5*y*y + 2*y +3;
	System.out.println(z);
	
	System.out.println();
	
	int a = 5;
	int b = 1;
	int u = (a-b) * (a+b);
	System.out.println(u);
	
	System.out.println();
	
	int q = 64;
	int w = q/8;
	int e = w/4;
	int t = e*3;
	
	System.out.println(t);
	System.out.println();
	
	String s = "123 + 456 \n";
	System.out.println(s);
	
	int n = 333;
	String m = "Amigo" + n;
	
	System.out.println(m);
	
	
 }
	
}
