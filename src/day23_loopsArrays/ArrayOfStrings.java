package day23_loopsArrays;

public class ArrayOfStrings {
	public static void main(String[] args) {
		
		String [] name = new String [5];
		String [] names2 = {"Bill", "Tom", "Vlad", "Burak", "Maria"};
				System.out.println(names2 [4]);
				
				System.out.println("Number of items: " +names2.length);
				
				
		String [] countries = {};
		countries [0] = "usa";// out of bounds exceptions
		
				String [] fruits = new String [] {"apples" , "orange"};
				for (String fruit : fruits) {
					System.out.println(fruit);
				}
				
	}

}
