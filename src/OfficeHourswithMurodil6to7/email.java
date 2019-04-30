package OfficeHourswithMurodil6to7;

public class email {
public static void main(String[] args) {
	
//	System.out.println(generateEmail("Jaime","Lannister"));
//	System.out.println(generateEmail("Cersei","Lannister", "GoT"));
	
	String [] characters = {"Daenerys Targarien", "Lyanna Mormont", "Sansa Stark", "Margaery Tyrell", "Petyr Bailish", "Renly Baratheon"};


	for(String str:characters ) {
		String name = str.split(" ")[0]; //short cut for splitting and pointing at the certain spot in the array!!!
		String lastname = str.split(" ")[1];
		System.out.println(generateEmail(name, lastname));
	}
	
	String word = formatName("lyanna mormont uncapitalized");

	System.out.println(word);
}
//this method only takes 2 params
public static String generateEmail(String firstName, String lastName) {
	return firstName.toLowerCase() + "_"+ lastName.toLowerCase() + "@gmail.com";
}
//this method takes 3 params
public static String generateEmail(String firstName, String lastName, String domain) {
	return firstName.toLowerCase() + "_"+ lastName.toLowerCase() +"@"+domain +".com";
}

public static String  formatName(String str) {
	//it will capitalise first characters
	//and will turn all other characters into lower case
	
	str =str.trim();
	if(str.isEmpty()) {
		return "Name is too short";
	}else if(str.contains(" ")) {
		
		String[] values = str.split(" ");
		String result = "";
		for(String value : values) {
			
			result = result + str.substring(0, 1).toUpperCase()+ str.substring(1).toLowerCase() + " ";
		}
		return result.trim();
	}
	
	
	return str.substring(0, 1).toUpperCase()+ str.substring(1).toLowerCase(); 
}


}
