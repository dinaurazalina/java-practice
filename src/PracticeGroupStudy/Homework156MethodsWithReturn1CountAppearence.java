package PracticeGroupStudy;

public class Homework156MethodsWithReturn1CountAppearence {
	public static void main(String[] args) {
		String [] arr = new String[] {"a", "foo", "bar", "foo", "bla", "foo"};
		String t = "foo";
		System.out.println(count_appearance(arr, t));
	}

	public static int count_appearance(String []arr, String t) {
		int count = 0;
		for(int i = 0; i< arr.length; i++) {
			if(t.equals(arr[i])) {
				count++;
			}
			
		}
		
		return count;
		
		
		
	}
}
