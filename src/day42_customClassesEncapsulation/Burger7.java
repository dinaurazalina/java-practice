package day42_customClassesEncapsulation;

import java.util.Arrays;

public class Burger7 {

	public static void main(String[] args) {
		Burger burger1 = new Burger();
		burger1.name ="Cowboy";
		String[] ings = {"onion crips", "american cheese", "pickles", "lettuce", "b7 sauce"};
		burger1.ingredients = ings;
		
		System.out.println(burger1.name);
		System.out.println(Arrays.toString(burger1.ingredients));
		
		System.out.println(burger1.ingredients[0]);
		
		
		for(String b:burger1.ingredients) {
			System.out.println(b);
		}
	}
}
