package day28_multiDArrays;

import java.util.Arrays;

public class FootballTeams {

	public static void main(String[] args) {
		//declare multiD array with 2 rows and 6 columns
		String [] [] teams = new String[2][6];
		teams [0][0] = "Irina";
		teams [0][1] = "Zarif";
		teams [0][2] = "Cihan";
		teams [0][3] = "Habib";
		teams [0][4] = "Adel";
		teams [0][5] = "Bojan";
		
		teams [1][0] = "Olimjon";
		teams [1][1] = "Mirshod";
		teams [1][2] = "Usman";
		teams [1][3] = "Nursultan";
		teams [1][4] = "Roman";
		teams [1][5] = "Dmitriy";
		
		System.out.println("First player of first team: ");
		System.out.println(teams[0][0]);
		
		System.out.println("Forth player of first team: ");
		System.out.println(teams[0][3]);
		
		System.out.println("Second player of second team: ");
		System.out.println(teams[1][1]);
		
		System.out.println("Last player of second team: ");
		System.out.println(teams[1][5]);
		
		
		
		//print how many rows/teams/arrays
		
		System.out.println("Number of teams: " + teams.length);
		
		//print how many ppl are there in the first team
		
		System.out.println("Number of people: " + teams[0].length);
		
		//print how many ppl are there in the seconds team
		
		System.out.println("Number of people: " + teams[1].length);
				
		
		System.out.println(Arrays.deepToString(teams));
		
		
	}
}
