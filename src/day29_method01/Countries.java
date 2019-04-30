package day29_method01;

import java.util.Arrays;

public class Countries {

	public static void main(String[] args) {
		
		String [][] countries  = new String [9][2];
		
		
		countries [0][0] = "USA";
		countries [1][0] = "Canada";
		countries [2][0] = "Mexico";
		countries [3][0] = "Brasil";
		countries [4][0] = "Peru";
		countries [5][0] = "Argentina";
		countries [6][0] = "Bolivia";
		countries [7][0] = "Macedonia";
		countries [8][0] = "Kazakhstan";
		
		
		countries [0][1] = "Washington DC";
		countries [1][1] = "Ottawa";
		countries [2][1] = "Mexico City";
		countries [3][1] = "Brazilia";
		countries [4][1] = "Lima";
		countries [5][1] = "Buenos Aires";
		countries [6][1] = "La Paz";
		countries [7][1] = "Scopia";
		countries [8][1] = "Nursultan";
		
		System.out.println(Arrays.deepToString(countries));
		
		
		System.out.println(countries[0][0]+ "|" + countries[0][1]);
		System.out.println(countries[8][0]+ "|" + countries[8][1]);
		
		//print all the countries in same line separated by  "|" with for loop
			String str = "";
		for(int i = 0; i< countries.length; i++) {
			str += countries[i][0] + " | ";
		System.out.println(str);
		
		
		//for each loop
		//to print out capitals
		
		for(String [] country : countries) { 
			System.out.print(country[1] + "| " );
		}
		 
		//get all the cities and add to cities array
		System.out.println();
		System.out.println("*************************");
		
	
	
	String [] cities = new String [countries.length];
	for(int j = 0; j< countries.length;j++) {
	cities[j] =countries[j][1];
	}
	System.out.println(Arrays.toString(cities));
	
	
	
	
	
	
	String result = "Failed";
	
	for(int row = 0; row< countries.length; row++) {
		if(countries[row][0].equals("Bolivia") && countries[row][1].equals("La Paz")) {
			result = "Correct";
		break;
		}
		
		} 
	System.out.println(result);

		}
	
	
	
	
	
	}
	
}
