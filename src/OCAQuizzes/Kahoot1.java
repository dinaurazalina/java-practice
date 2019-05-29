package OCAQuizzes;

import java.util.ArrayList;
import java.util.Arrays;

public class Kahoot1 {

	public static void main(String[] args) {
		int a = 'B';
		long a1 = '8';
		double a2 =100L;
		//first by default ascii table it recognises int then it looks for primities
		method('L');//first it will look for primitive type because it has close relations with primitives
					// unless you convert to Wrapper class like in #2
		//#2 
		method(new Character ('L'));
		
		
		
		// ==============second question ==============
		
		ArrayList<Integer> list = new ArrayList<>();
			list.add(1);
			list.add(2);
			list.add(3);// primive : it removes the index number 
			list.remove(1);//so the result will be : 1, 3
		
			//another case, if it is wrapper class:
			Integer ar= 1;
			list.remove(ar); //wrapper: removes that specific value.Result: 
			System.out.println(list); //.Result: 3
		
		boolean b1 = list.remove(new Integer(3));
		//wrapper class :return boolean expression in remove method
		
		
		ArrayList <Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		Integer s1 = 2;											//0, 1, 2, 3, 4
		if(list1.remove(s1)) {									//[1, 3, 4, 5]
			list1.remove(2);									//[1, 3, 5]
		}
		
		System.out.println(list1);
	}
	public static void method(int a) { 	//a ='L';
		System.out.println("int version");
	}
	public static void method(Character a) {	//wrapper class
		System.out.println("Character version");
	}	
	public static void method(byte a) {
		System.out.println("byte version");
	}
	
	
	
	
	
}
