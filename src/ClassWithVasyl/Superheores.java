package ClassWithVasyl;

import java.util.Arrays;

public class Superheores {

	public static void main(String[] args) {
		
		String []superheroes = {"Spiderman", "Iron Man", "Hulk", 
								"Wonder Woman", "Thor", "Batman", "HellBoy", 
								"Captain America", "Flash", "Superman", "Ant-man", "Aquaman"};
		
		
		
		int count =0;
		String heroesWithSpace = "";
		for(String s: superheroes) {
			if(s.contains(" ")) {
				System.out.println(s);
				heroesWithSpace = heroesWithSpace + s+ ", ";
				count++;
			}
		}
		
		
		System.out.println("Count of superheroes with space: "+ count);
		System.out.println(heroesWithSpace.substring(0, heroesWithSpace.length()-2));
		
		String [] newHeroes = heroesWithSpace.split(", ");
		System.out.println(Arrays.toString(newHeroes));
		
		String[] newHeroes2 = new String [count];
		for (int i = 0, j=0; i < superheroes.length; i++) {
			if(superheroes[i].contains(" ")) {
				newHeroes2[j] = superheroes[i];
				j++;
			}
			System.out.println(" int i : "+ i +" int j: "+j);
			
		}
		
	}
}
