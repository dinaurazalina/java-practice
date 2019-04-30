package day08_casting_conditionals;

public class IfElseWithVariable {

	public static void main(String[] args) {
		
		int temperature = 45;
		
		if(temperature >= 65) {
			System.out.println("It's a nice day! Lets code JAVA");
			
		}else{
			System.out.println("Stay home and code java");
		}
		
		System.out.println();
		
		// 2 int variables. teamAScore, teamBScore
		//put a condition. check if teamA won. 
		//"Team A won".
		//Go to Team A
		//else "team b won or it was a draw"
		//Go Teams
		
		
		
		
		int teamAScore = 23;
		int teamBScore = 23;
		
		if(teamAScore > teamBScore) {
			System.out.println("Team A won");
			
		}else if(teamAScore< teamBScore){
			System.out.println("Team B won");
		}else {
			System.out.println("It was a draw!");
		}
		
		
		
	}
}
