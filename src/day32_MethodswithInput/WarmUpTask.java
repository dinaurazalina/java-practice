package day32_MethodswithInput;

public class WarmUpTask {
public static void main(String[] args) {
	makePancakes();
	System.out.println();
	makePasta() ;
	System.out.println();
	cook("Omelette", "Eggs, Salt, Tomatoes, Green Peppers, Onions");
}
public static void cook (String dish, String ingredients) {
	System.out.println(		"~~" + dish.toUpperCase()+ " RECIPE~~");
	add(ingredients);
	System.out.println("Cook it until it is ready");
	System.out.println("~~"+ dish.toUpperCase()+ " IS READY!~~");
}


public static void makePancakes() {
	System.out.println("	~~~Pancakes Recipe~~~");
	System.out.print("- ");
	 add("Milk, Eggs, Flour, Sugar, Salt");
	 System.out.print("- ");
	mix(120);
	System.out.print("- ");
	fry(3);
	System.out.print("- ");
	nutella("Nutella ");
	System.out.println("~~~Enjoy your delicious pancakes!~~~");
}
public static void makePasta() {
	System.out.println("	~~~ Italian Pasta Recipe~~~");
	add("Water, Salt, Olive Oil");
	boil(2);
	add("Spagetti Pasta");
	boil(8);
	mix(60);
	add("Parmesan cheese");
	
	System.out.println("~~~Delicious Pasta is ready~~~");
}
public static void add (String veggies) {
	System.out.println("Adding " + veggies);
}
public static void mix (int sec) {
	System.out.println("Mixing for " + sec + " seconds");
}

public static void fry (int min) {
	System.out.println("Frying for " +min +" minutes");
}

public static void boil (int min) {
	System.out.println("Boiling for " + min+ " minutes" );
}

public static void nutella (String nut) {
	System.out.println("Don't forget "+ nut);
}
}
