package day39_ArrayList04;
import java.util.*;
public class Cities {

	public static void main(String[] args) {
		
ArrayList<String> cities = new ArrayList<>();
        
        cities.add("Tokyo");
        cities.add("New York");
        cities.add(0,"Paris");
        cities.add("Pittsburgh");
        cities.add(1,"Berlin");
        cities.add("Madrid");
        cities.add("Moscow");
        cities.add("Istanbul");
        cities.add("Washington D.C.");
        cities.add("Amsterdam");
        cities.add("Zurich");
        cities.add("Singapore");
        cities.add("Milan");
        cities.add("Toronto");
        cities.add("London");
        cities.add("Lima");
        
        
        //FOR EACH LOOP: print each city with pipe between them 
        for(String city: cities) {
        	System.out.print(city + " | ");
        	
        }
        System.out.println();
        System.out.println();
        
        //FOR LOOP: print each city with pipe
        for(int i =0; i < cities.size();i++) {
        	System.out.print(cities.get(i)+" * ");
        }
        System.out.println();
        System.out.println();
        
        //print each city toUpperCase
        for(int i =0; i<cities.size(); i++) {
        	System.out.print(cities.get(i).toUpperCase() + " ~ ");
        }
        System.out.println();
        System.out.println();
        
        //assign toUpperCase to each value
        
        for(int i = 0; i< cities.size(); i++) {
        	String temp = cities.get(i).toUpperCase();
        	cities.set(i, temp);
        	
        }
        System.out.println(cities);
	
	//shortest and longest cities length
     
        String lon = cities.get(0);
        String petite = cities.get(0);
        for(int i =0; i< cities.size(); i++) {
        	if(cities.get(i).length() > lon.length()) {
        		lon = cities.get(i);
        	}
        	if(cities.get(i).length()<petite.length()) {
        		petite = cities.get(i);
        	}
        
        }
	System.out.println();
	System.out.println(lon + " with its length of " + lon.length() + " is the longest word in the array");
	
	System.out.println(petite + " with its length of " + petite.length() + " is the shortest word in the array");
	
	
	ArrayList<String> citiesMoreThan6 =new ArrayList<>();
	//assign all cities that have more than 6 chars to this arrayList
	
	for(String city: cities) {
		if(city.length()>=6) {
			citiesMoreThan6.add(city);
		}
	}
	System.out.println(citiesMoreThan6);
	
	
	
	
	
	
	
	}
}
