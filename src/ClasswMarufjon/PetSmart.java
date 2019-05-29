package ClasswMarufjon;

public class PetSmart {

	public static void main(String[] args) {
		Cat murodilsCat = new Cat();
		murodilsCat.breed = "persian cat";
		murodilsCat.name = "Barsik";
		
		sellCat(murodilsCat);
		
		OnlineCat marufsImaginaryCat = new OnlineCat();
		marufsImaginaryCat.breed = "lebanese";
		marufsImaginaryCat.name = "Tark";
		marufsImaginaryCat.location = "Arlington, TX";
		sellCatOnline(marufsImaginaryCat);
		marufsImaginaryCat.makeSomeNoise();
		
		
		
	}
	
	
	public static void sellCat(Cat cat) {
		System.out.println("Selling "+ cat.breed);
		System.out.println("Its name is "+ cat.name);
	}
	
	
	
	public static void sellCatOnline(OnlineCat cat) {
		System.out.println("Selling "+ cat.breed);
		System.out.println("Its name is "+ cat.name);
		System.out.println("Its location is "+ cat.location);
	
		
	}
}
