package day45_practive_and_review;

public class CreatingAccount {

	public static void main(String[] args) {
		
		EtsyAccount acc1 = new EtsyAccount();
		acc1.setEmail("poohchi@feed.me");
		acc1.setFirstName("MrPoohchi");
		acc1.setPassword("ilovechicken123");
		System.out.println(acc1.toString());
		
		
		EtsyAccount acc2 = new EtsyAccount();
		acc2.setEmail("pussycat.meow");
		acc2.setFirstName("cat#1");
		acc2.setPassword("cat12");
		
		System.out.println(acc2.toString());
		
		EtsyAccount acc3 = new EtsyAccount("helix@royalhost.info", "Helireva", "royal");
		System.out.println(acc3.toString());
	
	
	
		EtsyAccount acc4 = new EtsyAccount("poopoo@gmail.com", "poohchi");
		System.out.println(acc4.toString());
	}
}
