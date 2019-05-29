package ClasswMarufjon;

public class Employees {

	public static void main(String[] args) {
		EmailGenerator.companyName = "Deloitte";
		
		EmailGenerator e1 = new EmailGenerator("Roman");
		System.out.println(e1.getEmail());
		
		EmailGenerator e2 = new EmailGenerator("Florian");
		System.out.println(e2.getEmail());
		
		
		EmailGenerator.companyName = "Shmeloitte";
		
		System.out.println(e1.getEmail());
		System.out.println(e2.getEmail());
	}
}
