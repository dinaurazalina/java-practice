package day25_Array;

import java.util.Arrays;
import java.util.Random;

public class WarmUpTaskNames {

	public static void main(String[] args) {
		String[] names = { "James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda", "William",
				"Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Charles",
				"Margaret", "Christopher", "Karen", "Daniel", "Nancy", "Matthew", "Lisa", "Anthony", "Betty", "Donald",
				"Dorothy", "Mark", "Sandra", "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna", "Kenneth",
				"Emily", "George", "Carol", "Joshua", "Michelle", "Kevin", "Amanda", "Brian", "Melissa", "Edward",
				"Deborah", "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Laura", "Jeffrey", "Helen", "Ryan",
				"Sharon", "Jacob", "Cynthia", "Gary", "Kathleen", "Nicholas", "Amy", "Eric", "Shirley", "Stephen",
				"Angela", "Jonathan", "Anna", "Larry", "Ruth", "Justin", "Brenda", "Scott", "Pamela", "Brandon",
				"Nicole", "Frank", "Katherine", "Benjamin", "Samantha", "Gregory", "Christine", "Raymond", "Catherine",
				"Samuel", "Virginia", "Patrick", "Debra", "Alexander", "Rachel", "Jack", "Janet", "Dennis", "Emma",
				"Jerry", "Carolyn", "Tyler", "Maria", "Aaron", "Heather", "Henry", "Diane", "Jose", "Julie", "Douglas",
				"Joyce", "Peter", "Evelyn", "Adam", "Joan", "Nathan", "Victoria", "Zachary", "Kelly", "Walter",
				"Christina", "Kyle", "Lauren", "Harold", "Frances", "Carl", "Martha", "Jeremy", "Judith", "Gerald",
				"Cheryl", "Keith", "Megan", "Roger", "Andrea", "Arthur", "Olivia", "Terry", "Ann", "Lawrence", "Jean",
				"Sean", "Alice", "Christian", "Jacqueline", "Ethan", "Hannah", "Austin", "Doris", "Joe", "Kathryn",
				"Albert", "Gloria", "Jesse", "Teresa", "Willie", "Sara", "Billy", "Janice", "Bryan", "Marie", "Bruce",
				"Julia", "Noah", "Grace", "Jordan", "Judy", "Dylan", "Theresa", "Ralph", "Madison", "Roy", "Beverly",
				"Alan", "Denise", "Wayne", "Marilyn", "Eugene", "Amber", "Juan", "Danielle", "Gabriel", "Rose", "Louis",
				"Brittany", "Russell", "Diana", "Randy", "Abigail", "Vincent", "Natalie", "Philip", "Jane", "Logan",
				"Lori", "Bobby", "Alexis", "Harry", "Tiffany", "Johnny", "Kayla" };
	
	
	
	System.out.println("Number of names:  " + names.length);
	System.out.println("******************************************************************");
	//print all names in one line
	System.out.println(Arrays.toString(names));
	
	//Print in column format
	//2 names each line
	System.out.println("******************************************************************");
	System.out.println();
	for(int i = 0; i < names.length ; i+=2) {
		System.out.println(names [i]+ ", " + names[i+1]);
	}
	
	
	//print female names
	System.out.println("******************************************************************");
	System.out.println();
	System.out.println("Female names: ");
	for(int i= 0; i < names.length; i++) {
		if(i%2==1) {
			if(i == names.length - 1) {
			System.out.print(names[i]);
		}else{
			System.out.print(names[i] + ", ");}
		}
	}
	
	//print male names 
	System.out.println();
	System.out.println("******************************************************************");
	System.out.println();
	System.out.println("Male names: ");
	for(int i = 0; i< names.length; i+=2) {
		System.out.print(names[i]+ ", ");
	}
	
	
	
	//print random names
	System.out.println();
	System.out.println("******************************************************************");
	System.out.println();
	Random random = new Random();
	int r = random.nextInt(names.length);
	
	System.out.println("Random name: " + names[r]);
	
	
	//print all names that are up to 4 characters in uppercase in same line
	System.out.println();
	System.out.println("******************************************************************");
	System.out.println();
	System.out.println("Short names with 4 or less characters: ");
	for(int i = 0; i< names.length; i++) {
		if(names[i].length() <= 4) {
			System.out.print(names[i].toUpperCase() + ", ");
		}
	}
	
	System.out.println();
	System.out.println("Short names using for each loop:");
	for(String name : names) {
		if(name.length()<=4) {
			System.out.print(name.toUpperCase() + ", ");
		}
	}
	
	System.out.println();
	System.out.println("******************************************************************");
	System.out.println();
	 String name3to4 = "";
	 String name5to6 = "";
	 String name7orMore = "";
	 //for loop
	for(int i = 0; i <names.length; i++) {
		if(names[i].length() <=4) {
			name3to4 += names[i] + " ";
		}else if(names[i].length() >=5 && names[i].length() <=6) {
			name5to6 += names[i]+ " ";
		}else if(names[i].length() >=7) {
			name7orMore+= names[i]+ " ";
		}
	
		}
		System.out.println("Names with 3 or 4 characters length: "+ name3to4);
		System.out.println("Names with 5 or 6 characters length: "+ name5to6);
		System.out.println("Names with 7 or more characters length: "+ name7orMore);
	
	
	
	//for each loop
		System.out.println();
		System.out.println("******************************************************************");
		System.out.println();
		
		for(String name : names) {
			if(name.length() <=4) {
				name3to4+= name + ", ";
			}else if(name.length()==5 || name.length()==6) {
				name5to6 += name + ", ";
			}else {
				name7orMore += name + ", ";
			}
		}
	System.out.println();
	System.out.println();
		System.out.println("Names with 3 or 4 characters length: "+ name3to4);
		System.out.println("Names with 5 or 6 characters length: "+ name5to6);
		System.out.println("Names with 7 or more characters length: "+ name7orMore);
	
	
	
	//switch places 
		System.out.println();
		System.out.println("******************************************************************");
		System.out.println();
		
		System.out.println("Names swapped: ");
		for(int i = 0; i <names.length; i+=2) {
			String newName =names[i]; 
			names[i] = names [i+1];
			names [i+1] = newName;
		}
		System.out.println(Arrays.toString(names));
	
		
		
		
	}
}
