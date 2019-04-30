package day25_Array;

public class WarmUpTask {
public static void main(String[] args) {
	
	

	int [] populationNum = {24, 67, 7865, 34534, 344343};

	
	System.out.println(populationNum [0]);
	int [] populationNum2 = {24, 6*2, 7865, 34534, 344343};
	System.out.println( "City 0 population "+ populationNum2 [0]);
	System.out.println( "City 1 population "+ populationNum2 [1]);
	System.out.println( "City 2 population "+ populationNum2 [2]);
	System.out.println( "City 3 population "+ populationNum2 [3]);
	System.out.println( "City 4 population "+ populationNum2 [4]);
	System.out.println( "City 5 population "+ populationNum2 [1]);


	int idx = 0;
	idx++;
	System.out.println("city 0 population: " + populationNum[idx] );

	
	
	String str = "abc";
	System.out.println("City 0 population: " + populationNum[str.length()]);




	String [] cities = {"Moscow", "London", "New York", "Rome", "Tokyo"};
 for (int i = 0; i < cities.length; i++) {
	 System.out.println("The population of " + cities[i] + " is " + populationNum2[i]);
 }



}
}
