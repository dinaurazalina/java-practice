package LeetCode;

import java.util.*;

public class RomantoNums {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word:");
		String s = scan.next();
//MCMXCIV > 1994
		//1000
		//100
		//1000
		//10
		//100
		//1
		//5
        int value =0;
        int result = 0;
        
        for(int i =0; i < s.length()-1; i++){
           
            if(s.charAt(i) < s.charAt(i+1)) {
            	result+= s.charAt(i+1)-s.charAt(i);
            	i++;
            }else {
            	result+=s.charAt(i);
            }
           
            }
        

	public int value(String s) {
		
		int value =0;
		for (int j = 0; j < s.length(); j++) {
	  	switch(s.charAt(j)){
        case('I'):
        value = 1;
        break;
        case('V'):
        value = 5;
        break;
        case('X'):
        value = 10;
        break;
        case('L'):
        value = 50;
        break;
        case('C'):
        value = 100;
        break;
        case('D'):
        value = 500;
        break;
        case('M'):
        value = 1000;
		
		}
	  	
	}
		return value;
	}
	}
