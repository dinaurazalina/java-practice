package day28_multiDArrays;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
public class FastFoodRestaurants {

	public static void main(String[] args) throws IOException {
	//read all data and assign to array
		
		String [] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
	
		System.out.println("Data size " + data.length);
	//print first row
		System.out.println(data[0]);
	
		System.out.println(data[1]);
		//print last restaurant 
		
		System.out.println(data[data.length-1]);
		
		
		//print rest info in separate lines
		int count =0;
		for(String oneline:data ) {
			count++;
			System.out.println("Number " + count +" => "+oneline);
			 
		}
		
		
	//print each Restaurant info in separate lines
	int counter =0;
	for(int i = 0; i < data.length; i++) {
		if(data[i].contains(",VA,")) {
			counter++;
			
		}
	}
	System.out.println(counter);
	
	//for each loop
	int counter1 = 0;
	for(String row:data) {
	
		if(row.contains(",VA,")) {
			System.out.println(row);
			counter1++;
		}
	}
	System.out.println("Total fast food restaurants in VA "+counter1);

	
	//find all restaurants in state of VA
	//print the restaurants names along with cityname
	//Subway-Herndon
	
	int count0 = 0;
	for(String res:data) {
		if(res.contains(",VA,")) {
			String []resArr = res.split(",");
			count0++;
			
			System.out.println("Number " + count0 +" " +resArr[2] + " "+resArr [1]);
		}
	}
	
	
	
	
	}
}
