package day24_arrays;
import java.util.Scanner;
public class Cities {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String [] cities = {"Washington D.C.", "Kyiv", "Annandale", "Moscow", "Istanbul", "Baku", 
				"Miami", "Silver Spring", "McLean"};
		
		System.out.println("The length of the array Cities is "+cities.length);
		System.out.println("Cities names that start with letter M: ");
		
		for(int i = 0; i < cities.length; i++) {
			if(cities[i].startsWith("M")) {
				System.out.println("- "+cities[i]);
			}
		}
		
		
		System.out.println("Cities names that do not start with letter M: ");
		
		for(int i = 0; i < cities.length; i++) {
			if(cities[i].startsWith("M")) {
				continue;
			}System.out.println("- "+cities[i]);
		}
		System.out.println();
		System.out.println();
		
		//same thing but with for each loop
		for(String city: cities) {
			if(city.startsWith("M")) {
				System.out.println(city);
			}
		}
		
		
	}

}
