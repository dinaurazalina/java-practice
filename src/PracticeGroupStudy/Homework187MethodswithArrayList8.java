package PracticeGroupStudy;
import java.util.*;
public class Homework187MethodswithArrayList8 {

	public static void main(String[] args) {
//		ArrayList<String>wordList1 = new ArrayList<String>();
//		
//		wordList1.add("boba");
//		wordList1.add("tea");
//		
//		ArrayList<String>wordList2 = new ArrayList<String>();
//		wordList2.add("camel");
//		wordList2.add("case");
//		System.out.println(combineAl(wordList1, wordList2));
		
		ArrayList<String>wordList = new ArrayList<String>();
		wordList.add("hi");
		wordList.add("hi");
		wordList.add("hi");
		wordList.add("yo");
		wordList.add("hi");
		wordList.add("hey");
		wordList.add("hi");
		removeAll(wordList, "hi");
	}
	
//	public static ArrayList<String>combineAl(ArrayList<String>wordList1, ArrayList<String>wordList2){
//		 ArrayList<String>combineAll = new ArrayList<String>();
//		 
//		 for(String w:wordList1 ) {
//		 combineAll.add(w);
//		 }
//		 for(String w2:wordList2 ) {
//		 combineAll.add(w2);
//		 } 
//		 
//		 return combineAll;
//	}
//	

	public static void removeAll(ArrayList<String>wordList, String targetWord) {
		 ArrayList<String> target = new ArrayList<>();
		 target.add(targetWord);
		 
		 wordList.removeAll(target);
		 System.out.println(wordList);
	}
	
	
	
}
