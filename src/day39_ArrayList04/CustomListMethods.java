package day39_ArrayList04;
import java.util.*;
public class CustomListMethods {

	public static void main(String[] args) {
		ArrayList<Integer> pew = new ArrayList<>();
		pew.add(718);
		pew.add(663);
		pew.add(9426);
		printList(pew);
		
		
		List<Double> nums = new ArrayList<>();
		nums.add(0.2);nums.add(1.2);nums.add(2.2);nums.add(3.3);
		nums.add(4.0);nums.add(5.2);nums.add(6.2);nums.add(7.2);
		
		System.out.println(sumList(nums));
		
		
		System.out.println(getList(15).contains(5));//chaining methods because it returns ArrayList.You can treat as an ArrayList
		
		
		System.out.println(getRandomList(7));
		
		printList(getRandomList(8));
		
		
		List<String> str = new ArrayList<>();
		str.add("5");str.add("2");str.add("94");str.add("62");str.add("8");
		
		System.out.println(convertToList(str));
	
		List <Integer> converted = convertToList(str);
		System.out.println(converted);
	
	
	
	
	
	}
	
	public static void printList (List<Integer> boo) {
		
		for(Integer i: boo) {
			System.out.print(i +" ");
		}
		System.out.println();
	}
	
	public static double sumList(List<Double> boo) {
		double sumList = 0;
		for(Double poopoo: boo) {
			sumList +=poopoo;
		}
		return sumList;
	}
	
	public static ArrayList<Integer> getList(int size){
		ArrayList<Integer> getList = new ArrayList<>();
		for(int i =1; i<=size; i++) {
			 getList.add(i);
		}
		return getList;
	}
	
	public static List<Integer> getRandomList(int size){
		List <Integer> randoms = new ArrayList<>();
		Random rand = new Random();
		for(int i =0; i< size; i++) {
			randoms.add(rand.nextInt(1001));
		}
		return randoms;
	}
	
	//it will take each string and convert to integer and return as Integer list
	public static List<Integer> convertToList(List<String> str){
		
		List<Integer> nums =new ArrayList<>();
	
		for(int i = 0; i < str.size(); i++) {
		nums.add(Integer.parseInt(str.get(i)));
		
		}
		
		return nums;
	}
	
}
