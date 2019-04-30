package PracticeGroupStudy;
import java.util.*;
public class Homework1342DArraysChessBoard {

	public static void main(String[] args) {
		 String[][] chessBoard = new String[8][8];
		
		 int num = 1;
		 char ch= 'a';
	for(int i = 0; i< chessBoard.length; i++) {
		for (int j = 0; j <chessBoard[i].length; j++) {
			chessBoard[i][j] = ""+num+ ch;
			ch++;
 		}	 
		ch='a';
		num++;		
		
		
		
		 }
		 
		 
		 System.out.println(Arrays.deepToString(chessBoard));
	}
}
