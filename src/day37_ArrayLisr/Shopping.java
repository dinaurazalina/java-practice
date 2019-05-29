package day37_ArrayLisr;
import java.util.*;

public class Shopping {

	public static void main(String[] args) {
		
		
		ArrayList <String> shopping = new ArrayList<>();
		
		shopping.add("Balenciaga shoes");
		shopping.add("Pinot Grigio wine");
		shopping.add("Lays chips");
		shopping.add("Dulce de Leche CheeseCake");
		shopping.add("blueberries");
		shopping.add("oysters");
		
		int count = shopping.size();
		System.out.println("Items count: "+count);
		System.out.println(shopping.toString());
		
		//print first and last item in single line
		
		System.out.println(shopping.get(0)+ ", "+ shopping.get(shopping.size()-1));
		
		//print without certain items/ remove
		
		shopping.remove("oysters");
		shopping.remove(3);
		System.out.println(shopping.toString());
		
		
		for(String item:shopping) {
			System.out.println(item);
			}
	
		
		
		//remove all items at once 
		
		
		shopping.clear();
		System.out.println(shopping.toString());
	}
}
