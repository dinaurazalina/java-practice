package PracticeGroupStudy;

import java.util.Arrays;

public class cla {
public static void main(String[] args) {
	
	String in = "my name is alice";
	System.out.println(camelCase(in));
}
	
	public static String camelCase(String in){
	
	String[] arr = in.split(" ");
	
	for(int i =0;i < arr.length;i++) {
	arr[i]=	arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
	}
	
	String a = "";
	for(String ab: arr) {
		 a+=ab+ " ";
	}
	a = a.trim();
	return a;
}

	
}
