package PracticeGroupStudy;
import java.util.Scanner;
public class homeworkArraysPrinting {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	String[] arr = new String[5];
	for (int i=0;i<5;i++)
	{
		arr[i] = input.nextLine();
	}
	for(int j = 0; j<arr.length; j++)
	System.out.println(arr[j].substring(0, 3));
	
	
	//assignment 101:
	   
	 String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	    //TODO: Write your code below
	    for(int i = 0; i <words.length; i++){
	      System.out.print(words[i].substring(0, 1));
	  
	      System.out.println(words[i].substring(words[i].length()-1));
	    }
	    
	    //assignment 102
	    
	    String sentence = input.nextLine();
	    
	   int idxOfLast = sentence.lastIndexOf(" ");
	    
	    int idx = sentence.indexOf(" ");
	    System.out.println(sentence.substring(idxOfLast+1));
	    System.out.println(sentence.substring(idx+1, idxOfLast));
	    System.out.println(sentence.substring(0, idx));
	    String reverse = "";
	    String [] str = sentence.split(" ");
	    for(int i = str.length -1; i>=0; i--) {
	    	 reverse +=str[i] + " ";
	    	
	    }
	    reverse = reverse.trim();
	   System.out.println(reverse);
}

}
