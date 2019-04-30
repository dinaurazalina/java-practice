package PracticeGroupStudy;
import java.util.*;
public class Homework1362DarraysDiagonalDifference {
	
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
	                              {scan.nextInt(), scan.nextInt(), scan.nextInt()},
	                              {scan.nextInt(), scan.nextInt(), scan.nextInt()}
	                            };
	    int result = 0;
	    
	    int leftsum = matrix[0][0]+ matrix[1][1]+matrix[2][2];
	    int rightsum = matrix[0][2]+ matrix[1][1]+matrix[2][0];
	    result = leftsum-rightsum;
	    // FINAL PRINT
	    System.out.println(Math.abs(result));
	  }
	}

