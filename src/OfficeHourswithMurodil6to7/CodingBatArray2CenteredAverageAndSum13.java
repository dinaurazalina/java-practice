package OfficeHourswithMurodil6to7;

import java.util.Arrays;

public class CodingBatArray2CenteredAverageAndSum13 {
 
	public static void main(String[] args) {
		
		int [] example = {13, 1, 2, 2, 1, 13};
		System.out.println(centeredAverage(example));
		
		int [] example2 = {13, 1, 25, 62, 41,12};
		System.out.println(centeredAverage2(example2));
		
		System.out.println("***");
		int [] example3 = {12};
		System.out.println(sum13(example3));
		
		
	}
	//this method sorts the array and eliminates the largest and the smallest from sum and counts the average  
	 //but it was done with Arrays.sort;
	public static int centeredAverage(int[] nums) {
		  int centeredAverage = 0;
		  int sum = 0;
		  Arrays.sort(nums);
		  for(int i = 1; i < nums.length-1; i++){
		    sum += nums[i];
		  }
		  
		  centeredAverage = sum / (nums.length-2);
		  return centeredAverage;
		  
		}
	
	//another method to count an average, but it doesnt work if there are two mins or maxes
	public static int centeredAverage2(int[] nums) {
	
		int centeredAverage2 = 0;
	
		int max = nums[0]; 
		int min = nums[0]; 
		
		for(int i =0; i< nums.length; i++) {
			if(nums[i]> max) {
				max = nums[i];
			}
			if(nums[i] < min) {
				min = nums[i];
			}
		}
		
		int sum = 0;
		for(int i = 0; i< nums.length; i++) {
			if(nums[i] != max && nums[i]!=min) {
				sum += nums[i];
			}
		}
		centeredAverage2 = sum / (nums.length-2);
		
		
		return centeredAverage2;
	}
	
	
	public static int sum13(int[] nums) {
		  int sum13 = 0;
		  for(int i = 0; i < nums.length; i++){
		    if(nums[i]== 13){
		      nums[i]= 0;
		      if(!(nums[i]==nums[nums.length-1])){
		        nums[i+1] = 0;
		      }
		    }
		  }
		  for(int i = 0; i < nums.length; i++){
		    sum13 += nums[i];
		  }
		  
		  
		  return sum13;
		}
	}