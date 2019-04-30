package day27_arrays05;
import java.util.Scanner;
public class Times {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("************** Welcome to time comparer **************");
	
	System.out.println("	  Please enter first time:");
 int [] time1 = {scan.nextInt(),scan.nextInt()};
 	System.out.println("	  Please enter second time: ");
 int [] time2 = {scan.nextInt(), scan.nextInt()};
 
 if(time1[0]< 0 || time1[0]>23) {
	 System.out.println("Time #1 has invalid hour");
	 return;
 }

 if(time1[1]< 0 || time1[1]>59) {
	 System.out.println("Time #1 has invalid minute");
	 return; 
 }
 
 
 if(time2[0]< 0 || time2[0]>23) {
	 System.out.println("Time #2 has invalid hour");
	 return;
 }

 if(time2[1]< 0 || time2[1]>59) {
	 System.out.println("Time #2 has invalid minute");
	 return; 
 }
 
 
 if(time1[0] < time2[0]) {
	 System.out.println("time #1 is earlier ");
 }else if(time1[0]> time2[0]) {
	 System.out.println("time #2 is earlier ");
 }else if(time1[0]==time2[0]) {
	 if(time1[1]<time2[1]) {
		 System.out.println("time #1 is earlier ");
	 }else if(time1[1]>time2[1]) {
		 System.out.println("time #2 is earlier ");
	 }else {
		 System.out.println("The time you have entered are equal");
	 }
 }
 
 
 
 //same thing with ternary 
 
 int time = ((time1[0]-time2[0])*100 +(time1[1]-time2[1]));
 String timeis = time >0 ? "time one is bigger": time ==0 ? "they are the same time":"time two is bigger";
 System.out.println(timeis);
 
 
 
	 }
 
}

