package day28_multiDArrays;

public class MultiDArraysNums {
public static void main(String[] args) {
	
	int [][] students =    {{4, 5, 6}, 
							{3, 2, 8}, 
							{9, 7, 4, 6, 78, 34, 3456}
							};
	
	//2 parts: outer loop, inner loop
	//outer loop will take each group
	//inner loop will take each value/ student id
	
	
	for(int [] group : students) {
		for(int studentsID : group) {
			System.out.print(studentsID +" ");
		}
		System.out.println(" ");
	}


		int [] [] nums = {
							{10, 20},									//0
							{20, 30, 40, 50},							//1
							{100, 200, 300, 400},						//2
							{555, 333, 222, 44, 11, 555, 888, 999, 77}  //3
						};
		
		for(int i = 0; i< nums.length; i++) {
			for(int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		
		}
}
