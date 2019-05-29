package day42_customClassesEncapsulation;
import java.util.*;
public class MyShoes {

	public static void main(String[] args) {
		Shoes shoes1 = new Shoes();
		
		shoes1.setShoesData("Dolce", 7.5);
		System.out.println(shoes1.getShoesData());
		Shoes shoes2 = new Shoes();
		shoes2.setShoesData("Balenciaga", 8.5);
		System.out.println(shoes2.getShoesData());
		Shoes shoes3 = new Shoes();
		shoes3.setShoesData("Manolo Blahnik", 7.0);
		System.out.println(shoes3.getShoesData());
		Shoes shoes4 = new Shoes();
		shoes4.setShoesData("Louboutin", 9.5);
		System.out.println(shoes4.getShoesData());
		System.out.println("=====================================");
		Shoes[] shoesArray = new Shoes[4]; 
		shoesArray[0] = shoes1;
		shoesArray[1] = shoes2;
		shoesArray[2] = shoes3;
		shoesArray[3] = shoes4;
		
		System.out.println(shoesArray[0].getShoesData());
		System.out.println(shoesArray[1].getShoesData());
		System.out.println(shoesArray[2].getShoesData());
		System.out.println(shoesArray[3].getShoesData());
		
		
		System.out.println(shoesArray[0].brand);
		System.out.println(shoesArray[1].brand);
		System.out.println(shoesArray[2].brand);
		System.out.println(shoesArray[3].brand);
	
		//ArrayList of Shoes;
		
		ArrayList<Shoes> myShoes = new ArrayList<>();
		myShoes.add(shoes1);
		myShoes.add(shoes2);
		myShoes.add(shoes3);
		myShoes.add(shoes4);
		
		System.out.println("*** *** *** *** ***");
		System.out.println(myShoes.get(0).size);
		System.out.println(myShoes.get(1).size);
		System.out.println(myShoes.get(2).size);
		System.out.println(myShoes.get(3).size);
		
		
		Shoes redShoes = myShoes.get(1);
		System.out.println(redShoes.getShoesData());
	
		
		//for each loop to print data for each shoes'
		System.out.println("***FOR EACH LOOP *** ***");
		for(Shoes shoes:myShoes) {
			System.out.println(shoes.getShoesData());
		}
	
		System.out.println("***FOR LOOP FOR PRINTING SIZE > THEN 7 *** ***");
		for(int i =0; i < myShoes.size(); i++) {
		if((myShoes.get(i).size)> 7) {
			System.out.println(myShoes.get(i).getShoesData());
		}
		}
		
		//OR
		
		
		for(Shoes shoes: myShoes) {
			if(shoes.size> 7) {
				System.out.println(shoes.getShoesData());
			}
		}
		
		
	}
}
