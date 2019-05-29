package day42_customClassesEncapsulation;
import java.util.*;
import java.lang.*;
public class StringShoesToObject {

	public static void main(String[] args) {
		
		String data = "Bruno Magli, 9.5";
		//split using "," and store it into a new array
		String[] arrData = data.split(",");
		
		
		Shoes shoes= new Shoes();
		//shoes.setShoesData(arrData[0], Double.parseDouble(arrData[1]));
		System.out.println(shoes.getShoesData());
	 //or 
		
		shoes.brand = arrData[0];
		shoes.size = Double.parseDouble(arrData[1]);
		System.out.println(shoes.getShoesData());
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What shoes brand?");
		String brand = scan.next();
		
		System.out.println("What is your size?");
		double size = scan.nextDouble();
		
		//create an object using data from scanner
		
		Shoes myShoes = new Shoes();
		myShoes.setShoesData(brand, size);
		System.out.println(myShoes.getShoesData());
	
		
		
	}
}
