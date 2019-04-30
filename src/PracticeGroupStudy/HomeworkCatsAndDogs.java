package PracticeGroupStudy;
import java.util.*;
public class HomeworkCatsAndDogs {
public static void main(String[] args) {
	

	Scanner scan = new Scanner(System.in);
	   
	String word = scan.next();
	   int countOfCats = 0;
	   int countOfDogs = 0;
	 
	
	for(int i = 0; i < word.length()-2; i++) {
		if(word.substring(i, i+3).equals("cat")){
			countOfCats++;	
		}
	}
	
	
	for(int i = 0; i < word.length()-2; i++) {
		if(word.substring(i, i+3).equals("dog")){
			countOfDogs++;	
		}
	}


	if(countOfCats ==countOfDogs) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	
	
	
	
		}
		}