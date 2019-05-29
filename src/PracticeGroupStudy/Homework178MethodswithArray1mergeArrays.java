package PracticeGroupStudy;
import java.util.*;
public class Homework178MethodswithArray1mergeArrays {

	public static void main(String[] args) {
		int [] a = {3, 4};
		int [] b = {9, 5, 8};
		
		System.out.println(Arrays.toString(mergR(a, b)));
		
	}
	
	public static int [] mergR(int [] a, int[] b){
		int [] arr = new int [a.length + b.length];
		
		for(int i = 0; i < a.length; i++) {
			arr[i]= a[i];
		}
		int k = 0;
		for(int j = a.length; j<arr.length; j++) {
		
			arr[j] = b[k];
			k++;
		}
		
		
		return arr;
	}
}
