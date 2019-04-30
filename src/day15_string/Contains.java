package day15_string;

public class Contains {
	public static void main(String[] args) {
		
		String email = "test@gmail.com";
		System.out.println(email.contains("@"));
	
	
		String list = "potatoes, apples, Eggs, tomatoes, milk, bread, cereal, avocados";
		
		
		if(list.contains("apples")) {
			System.out.println("Apples are there");
		}else {
			System.out.println("LETS ADD APPLES");
		}
		
		
		boolean hasEggs = list.toLowerCase().contains("eggs");
		System.out.println("Contains eggs: " + hasEggs);
		
		boolean hasCucumber = list.contains("cucumbers");
		System.out.println("Contains cucumbers: " + hasCucumber);
		
		
		email = "name@yahoo.com";
		if(email.contains("yahoo")) {
			System.out.println("It is yahoo email");
		}else if (email.contains("gmail")) {
			System.out.println("Gmail account");
		}else if(email.contains("hotmail")) {
			System.out.println("Hotmail account");
		}
		
		
		
		
		String etsyTitle = "Wooden spoon | Etsy";
		if(etsyTitle.contains(" | ")) {
			System.out.println("Pipe is there!");
		}else {
		System.out.println("Pipe is not detected");
		}

	
	String name = "Dina";
	if(name.contains("a") || name.contains("e")) {
		System.out.println("your name has letter 'e' or 'a' ");
	}else {
		System.out.println(" 'e' or a was not detected");
	}
	
	
	}

}


