package day25_Array;

public class Shopping {
	public static void main(String[] args) {
		
		String [] product = {"Gucci shoes", "Swatch Watch", "H&M Shirt",  "Gucci bag", "Addidas socks"};
		double [] price = {120.00, 5.99, 150.50, 3000.5, 6.99};
		
		
		int [] itemsId = {12344, 12345, 12346, 12347, 12348};
		
		System.out.println("Counter: " + product.length);
	
		
		//for each loop for each loop for each loop for each loop for each loop for each loop 
		
		for(String productsList : product) {
			System.out.println(productsList);
		}
		
		for(int i = itemsId.length-1; i >= 0; i--) {
			System.out.println(itemsId[i]);
		}
		
		double totalPrice = 0.0;
		for(int i = 0; i< product.length; i++) {
			if(product.length == price.length && price.length == itemsId.length) {
				 totalPrice += price[i];
				System.out.println("Item's ID: "  + itemsId[i]+", " +product[i]+ "'s price is " + price[i]);
				
			}
			System.out.println("Total price: $" + totalPrice );
			
			System.out.println("Please proceed to the counter.");
		}
		
		
		//find the most expensive item
		int maxIndex = 0;
		double maxPrice = 0.0;
		for(int i = 0; i < price.length; i++) {

			 if(price[i] > maxPrice) {
				 maxPrice = price[i];
				 maxIndex = i;
			 } 
		}
		System.out.println(itemsId[maxIndex] + " - " + product[maxIndex] + " - $" + maxPrice);
		
	}

}
