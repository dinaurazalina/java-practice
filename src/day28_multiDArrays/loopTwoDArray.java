package day28_multiDArrays;

import java.util.Arrays;

public class loopTwoDArray {

	public static void main(String[] args) {
		String [][] pizza = {
				{"pineapple", "pepperoni"},//0
				{"anchovies", "mushrooms", "olives"},//1
				{"cheese"},//2
				{"chicken", "tomatoes", "jalapenos", "onions" },//3
				{"green peppers", "zuccini", "broccolli", "spinach", "shrimp" }//4
		
		};
		
		
		System.out.println(Arrays.deepToString(pizza[3]));
		
		for(String [] pizzaArr:pizza) {
			System.out.print(pizzaArr.length +"-");
			System.out.println(Arrays.deepToString(pizzaArr));
		}
		System.out.println("######## FOR LOOP #########");
		
		for (int i = 0; i< pizza.length; i++) {
			System.out.print(pizza[i].length + " ");
			System.out.println(Arrays.deepToString(pizza[i]));
		}

	for(String topping: pizza[4]) {
		System.out.println(topping);//access specific array , will print out as a String
	}
	
	}
}
