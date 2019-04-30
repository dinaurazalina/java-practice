package PracticeGroupStudy;
import java.util.*;
public class ZombieAttack {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int[] inhabitants = new int[8];
	for (int i = 0; i < inhabitants.length; i++) {
		inhabitants[i] = input.nextInt();

	}
	// Declare a variable to keep track of the day
	int day =0;
	// Display the default values of the cities and day number
	System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
	// Increment the day by 1
	day=1;
	// Create a duplicate array so we can update the values in the for loop correctly
	int [] temp = inhabitants;//Arrays.copyOf(inhabitants, inhabitants.length);
	// We need a loop that will run as many times as needed
	while(true) {
	
	// The first thing we do in the loop is to check if any survivors are left
		int numPeopleAlive = 0;
		for(int i= 0; i < inhabitants.length; i++) {
			numPeopleAlive += inhabitants[i];
		}
	
		if(numPeopleAlive ==0) {
			break;
		}
	// If there are no survivors left, break out of the loop
	
	// Next we check if the first and last cities need to be cut in half
	
	// Assign a temporary variable to hold the value of the first city
		
		int tempFirst = inhabitants[0];
	
	// Assign a temporary variable to hold the value of the last city
	
		int tempLast = inhabitants[inhabitants.length-1];
	// Check if the second city is zero, and if so cut the temporary variable for the first city in half
	
		if(inhabitants[1] == 0){
			tempFirst = tempFirst/2;
		}
				
	// Check if the second to last city is zero, and if so cut the temporary variable for the last city in half
		if(inhabitants[1] == 0){
			tempLast= tempLast/2;
		}
	// The following must be a 2-step process: 1) modify the temporary array 2) set the inhabitants array equal to the temporary array
	// This process will ensure that each city will be compared with the proper version of the city that came before it
	
		for(int j =1; j< inhabitants.length-1; j++) {
			if(inhabitants[j-1]==0||inhabitants[j+1]==0 ) {
				temp[j]= inhabitants[j]/2;
			}
		}
	// Loop from the 2nd to the 2nd-last cities in the inhabitants array and cut its corresponding value in the temporary array in half if it is next to a 0 
	// We need to exclude the first and last cities in this loop so we can check adjacent cities without going out of bounds
	
	// Set the values in the inhabitants array to be equal to the temporary array we modified in the last step
	 for(int )
	// Assign the first and last cities as equal to their corresponding temporary variables
	// This must be done so that the previous for-loop can check the proper version of the first and last cities
	
	// Display the cities and day number
	
	// Increment the day
	break;
	}
	
	// Print out "---- EXTINCT ----" after the loop has finished running 


	


}
}
