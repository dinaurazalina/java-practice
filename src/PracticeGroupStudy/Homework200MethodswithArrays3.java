package PracticeGroupStudy;

import java.util.Arrays;

public class Homework200MethodswithArrays3 {

	public static void main(String[] args) {
		int[] i = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(do_switch(i)));
	}
	public static int[] do_switch(int[] i) 
	 {
	int x =i[0];
	i[0] = i[i.length-1];
	i[i.length-1] =x;
	
	return i;
	

	
		}
}
